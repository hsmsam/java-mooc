package part4.Statistics;

public class Statistics {
    private int count = 0;
    private int sum = 0;

    public Statistics() {
        this.count = count;
    }

    public void addNumber(int number) {
        sum += number;
        count += 1;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return sum;
    }

    public double average() {
        double average = 0.0;
        if (count > 0) {
            return average = 1.0 * sum / getCount();
        } else {
            return average;
        }
    }
}
