package part2;

import java.util.Scanner;

public class SumOfASequenceTheSequel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        System.out.print("First number? ");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.print("Last number? ");
        int lastNumber = Integer.valueOf(scanner.nextLine());

        while (firstNumber <= lastNumber) {
            sum += firstNumber;
            firstNumber++;
        }

        System.out.println("The sum is: " + sum);
    }
}
