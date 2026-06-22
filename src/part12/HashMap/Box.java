package part12.HashMap;

import java.util.ArrayList;

public class Box<T> {
    private ArrayList<T> elements;

    public Box() {
        this.elements = new ArrayList<>();
    }

    public void add(T item) {
        elements.add(item);
    }

    public void remove(T item) {
        elements.remove(item);
    }
}
