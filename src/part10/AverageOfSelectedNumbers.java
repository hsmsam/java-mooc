package part10;

import java.util.*;
import java.util.stream.Stream;

public class AverageOfSelectedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            inputs.add(input);

        }

        OptionalDouble averageOfPositiveNumbers = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number > 0)
                .average();

        OptionalDouble averageOfNegativeNumbers = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number < 0)
                .average();

        System.out.println();
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String input = scanner.nextLine();

        if (input.equals("n")) {
            System.out.print("Average of the negative numbers: " + averageOfNegativeNumbers.getAsDouble());
        }

        if (input.equals("p")) {
            System.out.print("Average of the positive numbers: " + averageOfPositiveNumbers.getAsDouble());
        }
    }
}
