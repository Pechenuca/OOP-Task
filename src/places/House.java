package places;

public class House extends  Place {


    public House(Place location, String name) {
        super(name, location);
    }

    @Override
    public String getName() {
        return "домов";
    }

}
