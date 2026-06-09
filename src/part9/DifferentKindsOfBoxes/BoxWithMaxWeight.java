package part9.DifferentKindsOfBoxes;

import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> box;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.box = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        int balance = 0;

        for (Item items : box) {
            balance += items.getWeight();
        }

        if (balance + item.getWeight() <= capacity) {
            box.add(item);
            balance += item.getWeight();
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return box.contains(item);
    }
}
