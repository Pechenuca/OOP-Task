package places;

import movableObj.MovablePerson;

public class Rocket extends Place implements MovablePerson {
    private String name = "Ракета";

    public String getName() {
        return this.name = name;

    }


    public Rocket(Place location) {
        super(location);
    }

    @Override
    public void goToPlace(Place f) {
        System.out.println(getName() + " летает вокруг " + f.getPlace());

    }


}
