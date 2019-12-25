public class Rocket implements MovablePerson, Place {
    private String location;
    private String name = " ракета ";


    @Override
    public void goToPlace(Place rocket, Place f) {
        this.location = f.setPlace();
        System.out.println("Летает вокруг " + f.setPlace());

    }

    @Override
    public String setPlace() {

        return "в ракете";

    }
}

