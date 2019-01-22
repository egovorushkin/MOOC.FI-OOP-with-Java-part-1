import java.util.ArrayList;

public class Bird {

    private String name;
    private String latinName;
    private int observation;

    public Bird() {
    }

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getObservation() {
        return observation;
    }

    public void increaseObservation(){
        this.observation++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    public int observation() {
        return this.observation++;
    }

    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.observation + " observations";
    }

}
