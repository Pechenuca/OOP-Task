import movableObj.Shorties;
import movableObj.Znaika;
import places.*;
import subject.Things;

public class Story {
    public static void main(String[] args) {

        Place f = new Planet(null, "Фантомас");
        Rocket R = new Rocket(f);
        Znaika Z = new Znaika(R, "Знайка");
        Street s = new Street(f);
        Place p = new Pavement(s);

        Shorties S = new Shorties(s, "коротышки");
        Place sw = new Sidewalk(f);
        Things binocular = new Things("бинокль", true);
        R.goToPlace(f);
        Z.goToPlace(R);
        S.goToPlace(s);
        Z.takeBinocular(binocular);
        Z.look(S, binocular, R);
        Z.Seems(S);
        S.Filled(p, sw);
        Z.Seems(s);



    }
}
