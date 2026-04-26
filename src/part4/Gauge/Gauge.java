package part4.Gauge;

public class Gauge {
    private int value = 0;

    public Gauge() {

    }

    public void increase() {
        if (value < 5) {
            value += 1;
        }
    }

    public void decrease() {
        if (value > 0) {
            value -= 1;
        }
    }

    public int value() {
        return value;
    }

    public boolean full() {
        boolean full = false;

        if (value == 5) {
            return true;
        } else {
            return false;
        }
    }
}
