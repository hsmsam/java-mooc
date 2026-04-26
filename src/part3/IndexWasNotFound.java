package part3;

import java.util.Arrays;
import java.util.Scanner;

public class IndexWasNotFound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int i = 0;

        numbers[0] = 6;
        numbers[1] = 2;
        numbers[2] = 8;
        numbers[3] = 1;
        numbers[4] = 3;
        numbers[5] = 0;
        numbers[6] = 9;
        numbers[7] = 7;

        System.out.print("Search for? ");
        int number = Integer.valueOf(scanner.nextLine());

        boolean found = false;

        while (i < numbers.length) {
            if (numbers[i] == number) {
                System.out.println(number + " is at index " + i + ".");
                found = true;
                break;
            }
            i++;
        }

        if (!found) {
            System.out.println(number + " was not found.");
        }

    }
}
