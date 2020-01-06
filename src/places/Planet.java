package places;

import java.util.Objects;

public class Planet extends Place {

    private final String name;
    public Planet(Place location, String name) {
        super(location);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Планета " + name;
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
    public int hashCode() {
        return Objects.hash(name);
    }
}
