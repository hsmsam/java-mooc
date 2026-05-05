package part5.OverloadedCounter;

public class Counter {
    private int value;

    public Counter(int startValue) {
        this.value = startValue;
    }

    public Counter() {
        this(0);
    }

    public int value() {
        return value;
    }

    public void increase() {
        value++;
    }

    public void decrease() {
        value--;
    }

    public void increase(int increaseby) {
        if (increaseby < 0) {
            value += 0;
        } else {
            value += increaseby;
        }
    }

    public void decrease(int decreaseby) {
        if (decreaseby < 0) {
            value += 0;
        } else {
            value -= decreaseby;
        }
    }
}
