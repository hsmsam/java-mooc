package part12.Pipe;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Pipe<T> {
    private ArrayList<T> elements;

    public Pipe() {
        this.elements = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        elements.add(value);
    }

    public T takeFromPipe() {
        if (elements.isEmpty()) {
            return null;
        }

        T item = elements.getFirst();
        elements.removeFirst();
        return item;
    }

    public boolean isInPipe() {
        if (elements.isEmpty()) {
            return false;
        }
        return true;
    }
}
