package places;


import movableObj.MovablePerson;

public class Rocket extends Place implements MovablePerson {


    public Rocket(Place location, String name) {
        super(name, location);
    }

    @Override
    public void goToPlace(Place f) {
        System.out.println(getName() + " летает вокруг " + f.getName());

    }


    @Override
    public String getName() {
        return "ракета";
    }
}

