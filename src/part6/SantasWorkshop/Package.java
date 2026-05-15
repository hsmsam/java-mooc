package part6.SantasWorkshop;

import java.util.ArrayList;

public class Package {
    ArrayList<Gift> gifts;

    public Package() {
        this.gifts = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        gifts.add(gift);
    }

    public int totalWeight() {
        int sumOfWeight = 0;
        for (Gift gift : gifts) {
            sumOfWeight += gift.getWeight();
        }
        return sumOfWeight;
    }
}
