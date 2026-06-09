package part9.DifferentKindsOfBoxes;

import java.util.ArrayList;

public class OneItemBox extends Box {
    private ArrayList<Item> box = new ArrayList<>();

    public OneItemBox() {
        this.box = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (box.isEmpty()) {
            box.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return box.contains(item);
    }
}
