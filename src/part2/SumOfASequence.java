package part2;

import java.util.Scanner;

public class SumOfASequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        int sum = 0;

        System.out.print("Last number ? ");
        int number = Integer.valueOf(scanner.nextLine());

        while (i <= number) {
            sum += i;
            i++;
        }

        System.out.println("The sum is " + sum);

    }
}
