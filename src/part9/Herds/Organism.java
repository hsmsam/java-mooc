package part9.Herds;

public class Organism implements Moveable {
    private int x;
    private int y;

    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public String toString() {
        return "x : " + x + "; y: " + y;
    }
}
