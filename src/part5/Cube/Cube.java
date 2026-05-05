package part5.Cube;

public class Cube {
    private int edgeLength;
    private int volume;

    public Cube(int edgeLength) {
        this.edgeLength = edgeLength;
    }

    public int volume() {
        volume = edgeLength * edgeLength * edgeLength;
        return volume;
    }

    public String toString() {
        return "The length of the edge is " + edgeLength + " and the volume is " + volume;
    }
}
