package part3;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 7;
        numbers[4] = 9;

        int index = 0;

        while (index < numbers.length) {
            System.out.println(numbers[index]);
            index++;
        }

        System.out.println("");

        System.out.println("Give two indices to swap:");
        int indices = Integer.valueOf(scanner.nextLine());
        int indices1 = Integer.valueOf(scanner.nextLine());

        int helper = numbers[indices];

        numbers[indices] = numbers[indices1];
        numbers[indices1] = helper;

        System.out.println("");

        index = 0;

        while (index < numbers.length) {
            System.out.println(numbers[index]);
            index++;
        }

    }
}
