public class Shorties extends Human implements MovablePerson {

    private String location;
    private boolean visibility;

    public void becomeVisibility(Znaika znaika) {
        this.visibility = true;
    }




    @Override
    public void goToPlace(Place h, Place s) {

        System.out.println("коротышки выбегают из " + h.setPlace() + s.setPlace());


    }
}
