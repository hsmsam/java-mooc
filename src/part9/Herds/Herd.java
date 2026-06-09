package part9.Herds;

import java.util.ArrayList;

public class Herd implements Moveable {
    private ArrayList<Moveable> herd = new ArrayList<>();

    public Herd() {
        this.herd = new ArrayList<>();
    }

    public void addToHerd(Moveable movable) {
        herd.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Moveable member : herd) {
            member.move(dx, dy);
        }
    }

    public String toString() {
        String result = "";
        for (Moveable member : herd) {
            result += member.toString() + "\n";
        }
        return result;
    }
}
