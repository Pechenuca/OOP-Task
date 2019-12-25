public class Story {
    public static void main(String[] args) {
        Znaika Z = new Znaika();
        Place f = new Fantomas();
        Place h = new House();
        Place r = new Rocket();
        Rocket R = new Rocket();
        Binocular B = new Binocular();
        Shorties S = new Shorties();
        Street s = new Street();
        Binocular binocular = new Binocular();
        Place rocket = new Rocket();

        R.goToPlace(rocket, f);
       /// Z.goToPlace(p1, r);
        Z.look(S, binocular);
        S.goToPlace(h, s);


    }
}
