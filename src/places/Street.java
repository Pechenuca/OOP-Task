package places;

public class Street extends Place {
    private boolean troubled;
    private String name;
    private Place location;

    public Street(Place location, String name) {
        super(name, location);
        this.location = location;
    }

    @Override
    public String getName() {
        return "улица";
    }

    public boolean getTroubled() {
        return this.troubled = true;
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
