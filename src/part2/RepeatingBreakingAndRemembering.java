package part2;

import java.util.Scanner;

public class RepeatingBreakingAndRemembering {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers: ");
        int sum = 0;
        int numbers = 0;
        double average = 0;
        int odd = 0;
        int even = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number <= 0) {
                break;
            }
            sum += number;
            numbers += 1;

            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbers);
        System.out.println("Average: " + (double) sum / (double) numbers);
        System.out.println("Even : " + even);
        System.out.println("Odd : " + odd);

    }
}
