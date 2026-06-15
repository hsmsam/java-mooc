package part10.SortThemCards;

import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {
    @Override
    public int compare(Card c1, Card c2) {
        if (c1.getSuit().ordinal() == c2.getSuit().ordinal()) {
            return c1.getValue() - c2.getValue();
        }
        if (c1.getSuit().ordinal() < c2.getSuit().ordinal()) {
            return -1;
        }
        return 1;
    }
}
