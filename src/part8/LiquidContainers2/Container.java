package part8.LiquidContainers2;

public class Container {
    private int firstContainer;
    private int containerLimit = 100;

    public Container() {
        this.firstContainer = 0;
    }

    public int contains() {
        return this.firstContainer;
    }

    public void add(int amount) {
        if (amount > 0) {
            if (firstContainer + amount <= containerLimit) {
                firstContainer += amount;
            } else {
                firstContainer = containerLimit;
            }
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            if (amount < firstContainer) {
                firstContainer -= amount;
            } else {
                firstContainer = 0;
            }
        }
    }

    public String toString() {
        return firstContainer + "/" + containerLimit;
    }
}
