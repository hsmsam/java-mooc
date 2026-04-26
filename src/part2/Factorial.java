package part2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 1;
        int sum = 1;

        System.out.print("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());

        while (i <= number) {
            sum = sum * i;
            i++;
        }
        System.out.println("Factorial: " + sum);
    }
}
