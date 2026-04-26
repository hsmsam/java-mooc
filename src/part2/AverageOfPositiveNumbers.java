package part2;

import java.util.Scanner;

public class AverageOfPositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = 0;
        int positiveNumbers = 0;
        int sum = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            } else if (number > 0) {
                numbers += 1;
                positiveNumbers += 1;
                sum += number;
            }
            numbers += 1;
        }
        if (positiveNumbers <= 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((double) sum / positiveNumbers);
        }
    }
}
