package movableObj;

import places.Place;

public class Shorties extends Human implements MovablePerson {

    private boolean visibility;
    private String tiny;
    private String tooMany;
    private String head = "головеньки";
    private String hands = "руками";

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
    public void Filled(Place p, Place sw) {

        System.out.println(getName() + " " + becomeTooMany() + " и они заполнили все " + p.getPlace() + " и " + sw.getPlace());

    }
    @Override
    public void goToPlace(Place s) {
        System.out.println(getName() + " выбегают " + s.getPlace());
    }


}
