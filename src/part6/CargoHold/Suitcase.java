package part6.CargoHold;

import java.util.ArrayList;

public class Suitcase {
    ArrayList<Item> items;
    int maximumWeight;

    public Suitcase(int maximumWeight) {
        this.items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() <= maximumWeight) {
            items.add(item);
        }
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;

        for (Item item : items) {
            totalWeight += item.getWeight();
        }

        return totalWeight;
    }

    public String toString() {
        if (items.isEmpty()) {
            return "no items (" + totalWeight() + "kg)";
        } else if (items.size() == 1) {
            return items.size() + " item (" + totalWeight() + "kg)";
        } else {
            return items.size() + " items (" + totalWeight() + "kg)";
        }
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }

        Item comparison = items.get(0);

        for (Item item : items) {
            if (item.getWeight() > comparison.getWeight()) {
                comparison = item;
            }
        }
        return comparison;
    }
}