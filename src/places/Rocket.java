package places;


import exceptions.NegativeAgeException;
import exceptions.NonZeroAngleException;
import movableObj.MovablePerson;


public class Rocket extends Place implements MovablePerson {


    public Rocket(Place location, String name) {
        super(name, location);
    }

    private int angleToHorizon = 60;


    @Override
    public void goToPlace(Place f) {
        System.out.println(getName() + " летит к " + f.getName());

    }

    public void flyAround(Rocket rocket, Place f) {
        System.out.println(rocket.getName() + "летает вокруг " + f.getName());
    }


    public void turnToHorizon(Rocket rocket, Mechanism mechanism) throws NegativeAgeException, NonZeroAngleException {

        if (mechanism.active) {
            rocket.angleToHorizon = 0;
            System.out.println("ракета параллельная горизонту");
        } else {
            throw new NonZeroAngleException("ракета должна лететь паралелльно горизонту! угол должен быть равен 0");
        }


    }

    @Override
    public String getName() {
        return "ракета";
    }


    public class Mechanism {
        private boolean active = false;

        public boolean isActive() {
            return active = true;
        }
    }

    public class Engine {
        private boolean active = false;

        public boolean isActive() {
            return active = true;
        }
    }

}

