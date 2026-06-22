package part12.Hideout;

import java.util.ArrayList;

public class Hideout<T> {
    private ArrayList<T> elements;

    public Hideout() {
        this.elements = new ArrayList<>();
    }

    public void putIntoHideout(T toHide) {
        if (!elements.isEmpty()) {
            elements.clear();
        }
        elements.add(toHide);
    }

    public T takeFromHideout() {
        if (elements.isEmpty()) {
            return null;
        }

        T item = elements.remove(0);
        elements.clear();
        return item;
    }

    public boolean isInHideout() {
        if (elements.isEmpty()) {
            return false;
        }
        return true;
    }
}
