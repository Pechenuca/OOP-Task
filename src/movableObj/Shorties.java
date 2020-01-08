package movableObj;

import places.Place;

public class Shorties extends Human implements MovablePerson {

    private boolean visibility;
    private String tiny;
    private String tooMany;
    private String head = "головеньки";
    private String hands = "руками";
    private Place location;

    @Override
    String dying() {
        return null;
    }

    public Shorties(Place location, String name) {
        super(location, name);
    }


    public String becomeTiny() {
        return tiny = "размером с маковое зернышко";
    }

    public String becomeTooMany() {
        return this.tooMany = "стало слишком много";
    }

    public String PullUp() {
        return "они задирали кверху " + head + " , ";
    }

    public String WaveHands() {
        return "махали " + hands;
    }

    public void goToPlace(Place pv, Place sw, Shorties S) {
        S.location = sw;
        System.out.println(getName() + " " + becomeTooMany() + " и они заполнили все " + location.getName());
        S.location = pv;
        System.out.print(" и " + location.getName());

    }

    public void goToPlace(Place s, Place h) {
        location = h;
        System.out.println(getName() + " выбегают из" + location.getName());
        location = s;
        System.out.println(" на " + location.getName());
    }


    @Override
    public void goToPlace(Place p2) {

    }
}
