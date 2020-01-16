package places;

public class Street extends Place {

    public Street(Place location, String name) {
        super(name, location);
    }

    @Override
    public String getName() {
        return "улица";
    }

    public boolean getTroubled() {
        boolean troubled;
        return troubled = true;
    }

    public String Waving() {
        return " вполнуется, ";
    }

    public String Bubbling() {
        return " клокочет, ";
    }

    public String Boiling() {
        return " кипит";
    }
}
