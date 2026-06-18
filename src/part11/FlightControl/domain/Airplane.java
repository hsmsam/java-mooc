package part11.FlightControl.domain;

public class Airplane {
    private String planeID;
    private int planeCapacity;

    public Airplane(String planeID, int planeCapacity) {
        this.planeID = planeID;
        this.planeCapacity = planeCapacity;
    }

    public String getPlaneID() {
        return planeID;
    }

    public int getPlaneCapacity() {
        return planeCapacity;
    }

    @Override
    public String toString() {
        return this.planeID + " (" + this.planeCapacity + " capacity)";
    }
}
