package part7.LiquidContainers2;

public class Container {
    private int container;
    private final int containerLimit;

    public Container() {
        this.container = 0;
        this.containerLimit = 100;
    }

    public int contains() {
        return this.container;
    }

    public void add(int amount) {
        if (amount > 0) {
            if (this.container + amount > this.containerLimit) {
                this.container = this.containerLimit;
            } else {
                this.container += amount;
            }
        }
    }

    public void remove(int amount) {
        if (amount > this.container) {
            this.container = 0;
        } else {
            this.container -= amount;
        }
    }

    public String toString() {
        return container + "/" + containerLimit;
    }
}
