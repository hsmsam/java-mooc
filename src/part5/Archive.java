package part5;

import java.util.ArrayList;
import java.util.Scanner;

public class Archive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String input1 = scanner.nextLine();

            boolean found = false;

            for (String item : list) {
                if (item.startsWith(input)) {
                    found = true;
                }
            }

            if (!(list.contains(input + input1))) {
                if (found == false) {
                    list.add(input + ": " + input1);
                }
            }
        }

        System.out.println("==Items==");

        for (String item : list) {
            System.out.println(item);
        }
    }
}


