package part10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintingUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            inputs.add(input);
        }

        String combined = inputs.stream()
                .reduce("", (previousString, word) -> previousString + word + "\n");
        System.out.println(combined);

    }
}
