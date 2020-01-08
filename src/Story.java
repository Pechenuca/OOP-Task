import movableObj.Shorties;
import movableObj.Znaika;
import places.*;
import subject.Things;

public class Story {
    public static void main(String[] args) {

        Place f = new Planet(null, "Планета");
        Rocket R = new Rocket(f);
        Znaika Z = new Znaika(R, "Знайка");
        Street s = new Street(f);
        Place pv = new Pavement(s);
        Shorties S = new Shorties(s, "коротышки");
        Place sw = new Sidewalk(f);
        Things binocular = new Things("бинокль", true);

        R.goToPlace(f);
        Z.goToPlace(R);
        S.goToPlace(s);
        Z.takeBinocular(binocular);
        R.flyTo(R, s);
        Z.look(S, binocular, R);
        Z.Seems(S);
        S.Filled(pv, sw);
        Z.Seems(s);



    }
}
