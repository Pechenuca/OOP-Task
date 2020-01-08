package places;

import movableObj.MovablePerson;

public class Fantomas extends Place implements MovablePerson {
    private String name;
    private Place location;
    public Fantomas (String name, Place location) {
        super(name, location);
    }

    @Override
    public void goToPlace(Place p) {
        System.out.print(getName() + "расположен на " + location.getName());
    }

    @Override
    public String getName() {
        return "Фантомас";
    }
}
