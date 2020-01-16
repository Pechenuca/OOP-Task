package movableObj;

import places.Place;
import places.Rocket;
import places.Street;
import subject.Things;

import java.io.IOException;

public class Znaika extends Human implements MovablePerson {

    @Override
    String dying() {
        return null;
    }

    public Znaika(Place location, String name) {
        super(location, name);
    }


    private Vision vision;

    public enum Vision {LOW, KEEN}

    public void takeBinocular(Things binocular) {
        this.vision = Vision.KEEN;
        System.out.println(getName() + "берет бинокль");

    }

    public String SeeThroughThing(Things thing, Znaika znaika) {

        if (thing.getseeThrough()) {
            znaika.vision = Vision.KEEN;

            return getName() + " cмотрит через " + thing.getName();
        }
        return " ничего не видит";
    }

    public void turnOnEngine(Rocket.Engine engine) {
        engine.isActive();
        System.out.println("Двигатель активен");
    }
    public void turnOnMechanism(Rocket.Mechanism mechanism) {
        mechanism.isActive();
        System.out.println("Механзм поворота активен");
    }
    public void turnRocket(Rocket.Mechanism mechanism, Rocket rocket) {

            if (mechanism.isActive())
                rocket.turnToHorizon(rocket, mechanism);
            System.out.println(rocket.getName() + "повернулась");

    }
    public void takeCourse(Place f, Rocket rocket, Rocket.Engine engine) {
        if(engine.isActive())
        rocket.goToPlace(f);
        System.out.println("Ракета берет курс на " + f.getName());
    }

    public void look(Shorties S, Things thing, Rocket r, Znaika znaika) {
        if (vision == Vision.KEEN && r.getPlace().equals(S.getLocation())) {
            System.out.println(SeeThroughThing(thing, znaika) + " на коротышек и видит, как " + S.PullUp() + S.WaveHands());
        }
    }

    public void Seems(Shorties S) {
        System.out.println(getName() + " казалось, что " + S.getName() + " " + S.becomeTiny());

    }

    public void Seems(Street s) {
        if (s.getTroubled()) {
            vision = Vision.LOW;
            System.out.println(getName() + " трудно было что-то расмотреть - " + " казалось, что " + s.getName() + " " + s.Waving() + s.Bubbling() + s.Boiling());
        }
    }

    @Override
    public void goToPlace(Place r) {

        System.out.println(getName() + " сидит " + location.getName());
    }

    @Override
    public String toString() {
        return "Знайка создан";
    }


}
