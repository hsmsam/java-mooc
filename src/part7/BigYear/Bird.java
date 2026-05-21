package part7.BigYear;

public class Bird {
    private String name;
    private String latinName;
    private int observation = 0;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observation = 0;
    }

    public String getName() {
        return this.name;
    }

    public String getLatinName() {
        return this.latinName;
    }

    public int getObservation() {
        return this.observation;
    }

    public void observation() {
        this.observation++;
    }

    public String toString() {
        return name + " (" + latinName + "): " + observation + " observations";
    }
}
