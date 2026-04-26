package part3;

import java.util.ArrayList;
import java.util.Scanner;

public class SecondPlusThird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            numbers.add(number);

            if (number == 0) {
                int number1 = numbers.get(1);
                int number2 = numbers.get(2);
                int sum = number1 + number2;
                System.out.println(sum);
                break;
            }
        }
    }
}
