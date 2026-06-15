package part10.SortThemCards;

import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {
    private ArrayList<Card> hand = new ArrayList<>();

    public Hand() {
        this.hand = new ArrayList<>();
    }

    public void add(Card card) {
        this.hand.add(card);
    }

    public void sort() {
        Collections.sort(hand);
    }

    public void print() {
        for (Card card : hand) {
            System.out.println(card);
        }
    }

    public void sortBySuit() {
        Collections.sort(hand, new BySuitInValueOrder());
    }


    @Override
    public int compareTo(Hand hand) {
        int handOne = 0;
        int handTwo = 0;

        for (Card card : this.hand) {
            handOne += card.getValue();
        }

        for (Card card : hand.hand) {
            handTwo += card.getValue();
        }

        if (handOne == handTwo) {
            return 0;
        }

        if (handOne < handTwo) {
            return -1;
        }
        return 1;
    }
}
