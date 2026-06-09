package part9.Warehousing;

public class Warehouse {
    private double capacity;
    private double balance;

    public Warehouse(double capacity) {
        if (capacity > 0) {
            this.capacity = capacity;
        }
    }

    public double getBalance() {
        return balance;
    }

    public double getCapacity() {
        return capacity;
    }

    public double howMuchSpaceLeft() {
        return capacity - balance;
    }

    public void addToWarehouse(double amount) {
        if (amount > 0) {
            balance += amount;
            if (balance > capacity) {
                balance = capacity;
            }
        }
    }

    public double takeFromWarehouse(double amount) {
        if (amount <= 0) {
            return 0;
        }

        if (amount > balance) {
            double taken = balance;
            balance = 0;
            return taken;
        }

        balance -= amount;
        return amount;
    }

    public String toString() {
        return "balance = " + balance + ", space left " + howMuchSpaceLeft();
    }
}
