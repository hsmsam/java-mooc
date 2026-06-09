package part9.InterfaceInABox;

import java.util.ArrayList;

public class Box implements Packable {
    private double maximumCapacity;
    private double balance;
    ArrayList<Packable> box = new ArrayList<>();

    public Box(double maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.balance = 0;
        this.box = new ArrayList<>();
    }

    public void add(Packable item) {
        if (balance + item.weight() < maximumCapacity) {
            balance += item.weight();
            box.add(item);
        }
    }

    @Override
    public double weight() {
        double weight = 0;

        for (Packable packable : box) {
            weight += packable.weight();
        }

        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + box.size() + " items, total weight " + weight() + " kg";
    }
}
