public class Znaika extends Human implements MovablePerson {

    private String location = null;
    public enum Vision {LOW, KEEN}

    public void look(Shorties S, Binocular binocular) {
        
        S.becomeVisibility();
        System.out.println("Знайка берет " + binocular.HaveBinocular()  + "смотрит на коротышек и видит, как ");
    }

    @Override
    public void goToPlace(Place p1, Place r) {
        this.location = r.setPlace();

        System.out.println( "Знайка сидит в  "+ p1.setPlace() + r.setPlace());
    }




}
