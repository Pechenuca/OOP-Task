package places;

public class Street extends Place {

    public Street(Place location, String name) {
        super(name, location);
    }

    @Override
    public String getName() {
        return "улица";
    }

    private boolean troubled;

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

    public void getNoisy(Street s) {
        Noisy iNoisy = new Noisy() {
            @Override
            public void noisy(Street s) {
                System.out.println(Waving() + " " + Bubbling() + " " + Boiling());

            }
        };
        iNoisy.noisy(s);
    }


}





