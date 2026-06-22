package part12.Lottery;

import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {
    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryRow() {
        this.random = new Random();
        this.randomizeNumbers();

    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public boolean containsNumber(int number) {
        if (numbers.contains(number)) {
            return true;
        }
        return false;
    }

    public void randomizeNumbers() {
        this.numbers = new ArrayList<>();

        int randomNumber;

        for (int i = 0; numbers.size() < 7; i++) {
            randomNumber = random.nextInt(40) + 1;
            if (!containsNumber(randomNumber)) {
                numbers.add(randomNumber);
            }
        }
    }

    public boolean equals(Object other) {
        return false;
    }
}
