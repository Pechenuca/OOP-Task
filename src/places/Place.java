package places;

import java.util.Objects;

public abstract class Place {


    private Place location;


    public Place(String name, Place location) {
        this.location = location;
    }

    public Place getPlace() {
        return location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o.getClass() != this.getClass()) {
            return false;
        }
        Place p = (Place) o;
        return Objects.equals(location, p.getPlace());
    }

    public abstract String getName();

    @Override
    public int hashCode() {
        return Objects.hash(location);
    }
}

