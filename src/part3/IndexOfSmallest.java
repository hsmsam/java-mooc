package part3;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 9999) {
                break;
            }
            numbers.add(number);
        }

        int smallest = numbers.get(0);

        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            if (smallest > number) {
                smallest = number;
            }
        }

        System.out.println("Smallest number: " + smallest);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == smallest) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}
