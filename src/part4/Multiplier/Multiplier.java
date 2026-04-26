package part4.Multiplier;

public class Multiplier {
    private int number = 0;

    public Multiplier(int number) {
        this.number = number;
    }

    public int multiply(int number) {
        int multiply = this.number * number;
        return multiply;
    }
}
