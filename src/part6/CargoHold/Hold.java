package part6.CargoHold;

import java.util.ArrayList;

public class Hold {
    ArrayList<Suitcase> suitcases;
    private int maximumWeight;
    private int totalWeight;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        totalWeight += suitcase.totalWeight();

        if (totalWeight <= maximumWeight) {
            suitcases.add(suitcase);
        }
    }

    public void printItems() {
        for (Suitcase item : suitcases) {
            item.printItems();
        }
    }

    public String toString() {
        if (suitcases.size() <= 0) {
            return suitcases.size() + " suitcases (" + totalWeight + "kg)";
        } else if (suitcases.size() == 1) {
            return suitcases.size() + " suitcase (" + totalWeight + "kg)";
        }
        return suitcases.size() + " suitcases (" + totalWeight + "kg)";
    }
}
