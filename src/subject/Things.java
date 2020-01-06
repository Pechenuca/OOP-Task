package subject;

public class Things {
    private boolean seeThrough;
    private String name;
    public Things(String name, boolean seeThrough) {
        this.name = name;
        this.seeThrough = seeThrough;

    }
    public boolean getseeThrough(){
        return this.seeThrough = true;
    }
    public String getName(){
        return this.name;
    }

}
