package places;

public class Street extends Place {
    private boolean troubled;

    public Street(Place location) {
        super(location);
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
    public String Boiling () {
        return " кипит";
    }
}
