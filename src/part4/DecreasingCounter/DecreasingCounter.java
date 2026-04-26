package part4.DecreasingCounter;

public class DecreasingCounter {
    private int value = 0;

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        if (value > 0) {
            this.value = value - 1;
        } else {
            this.value = 0;
        }
    }

    public void reset() {
        this.value = 0;
    }
}
