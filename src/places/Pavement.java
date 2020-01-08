package places;

public class Pavement extends Place {
    private String name;
    private Place location;
    public Pavement(Place location, String name) {
        super(name, location);
    }

    @Override
    public String getName() {
        return "мостовая";
    }


}
