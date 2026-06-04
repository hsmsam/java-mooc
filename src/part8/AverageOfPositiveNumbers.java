package part8;

import java.util.Scanner;

public class AverageOfPositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int counter = 0;
        double average = 0;

        while (true) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number == 0) {
                break;
            }

            if (number > 0) {
                sum += number;
                counter++;
            }
        }

        if (counter > 0) {
            average = sum / counter;
            System.out.println(average);

        } else {
            System.out.println("nnot");
        }
    }
}
