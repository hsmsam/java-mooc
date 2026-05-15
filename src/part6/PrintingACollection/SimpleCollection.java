package part6.PrintingACollection;

import java.util.ArrayList;

public class SimpleCollection {
    private String name;
    private ArrayList<String> elements;
    private int itemCounter;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
        itemCounter++;
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        String element = "";

        for (String name : elements) {
            element += name + "\n";
        }

        if (itemCounter <= 0) {
            return "The collection " + name + " is empty.";
        } else if (itemCounter == 1) {
            return "The collection " + name + " has " + itemCounter + " element:\n" + element;
        }

        return "The collection " + name + " has " + itemCounter + " elements:\n" + element;
    }
}
