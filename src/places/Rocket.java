package places;


import movableObj.MovablePerson;


public class Rocket extends Place implements MovablePerson {


    public Rocket(Place location, String name) {
        super(name, location);
    }
    private int angleToHorizon = 60;

    @Override
    public void goToPlace(Place f) {
        System.out.println(getName() + " летает вокруг " + f.getName());

    }



    public void turnToHorizon(Rocket rocket, Mechanism mechanism) {
        if (mechanism.active) {
            rocket.angleToHorizon = 0;
            System.out.println("ракета параллельная горизонту");
        } else
            System.out.println("ракета не параллельна");
    }
    @Override
    public String getName() {
        return "ракета";
    }



    public class Mechanism  {
        private boolean active = false;

        public boolean isActive() {
            return active = true;
        }
    }

    public class Engine {
        private boolean active = false;

        public boolean isActive() {
            return active = true;
        }
    }

}

