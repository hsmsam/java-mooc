package part9.DifferentKindsOfBoxes;

import java.util.ArrayList;

public class MisplacingBox extends Box {
    private ArrayList<Item> box = new ArrayList<>();

    public MisplacingBox() {
        this.box = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        box.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }
}
