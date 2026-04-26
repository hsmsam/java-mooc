package part3;

import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        int sum = 0;
        int average = 0;
        int amountOfNumbers = 0;

        while (true) {
            int number = Integer.valueOf(scanner.next());

            if (number == -1) {
                break;
            }

            numbers.add(number);
            sum += number;
            amountOfNumbers += 1;
        }
        System.out.println("Average: " + (double) sum / amountOfNumbers);
    }
}
