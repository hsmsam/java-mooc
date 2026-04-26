package part4.Statistics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();
        Statistics evenNumbers = new Statistics();
        Statistics oddNumbers = new Statistics();

        System.out.println("Enter numbers: ");

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == -1) {
                break;
            }

            if (number % 2 == 0) {
                evenNumbers.addNumber(number);
                statistics.addNumber(number);
            } else {
                oddNumbers.addNumber(number);
                statistics.addNumber(number);
            }
        }

        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + evenNumbers.sum());
        System.out.println("Sum of odd numbers: " + oddNumbers.sum());
    }
}
