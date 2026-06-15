package part10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LimitedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputs = new ArrayList<>();

        while (true) {
            int input = Integer.parseInt(scanner.nextLine());

            if (input < 0) {
                break;
            }

            inputs.add(input);

        }

        inputs.stream()
                .filter(number -> number >= 1 && number <= 5)
                .forEach(System.out::println);
    }
}
