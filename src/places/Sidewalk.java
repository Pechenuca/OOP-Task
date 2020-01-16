package places;

public class Sidewalk extends Place {
    private String name;
    private Place location;
    public Sidewalk(Place location, String name) {
        super(name, location);
    }

    @Override
    public String getName() {
        return "тротуары";
    }


}
