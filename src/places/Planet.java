package places;

import movableObj.MovablePerson;

import java.util.Objects;

public class Planet extends Place implements MovablePerson {

    private final String name;
    public Planet(Place location, String name) {
        super(name, location);
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Planet planet = (Planet) o;
        return Objects.equals(name, planet.name);
    }

    @Override
    public String getName() {
        return "планета";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public void goToPlace(Place p2) {

    }
}
