package part3;

import java.util.Scanner;

public class NameOfTheOldest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        int oldest = 0;
        String name = "";

        while (true) {
            String string = scanner.nextLine();

            if (string.isEmpty()) {
                break;
            }

            String[] pieces = string.split(",");

            age = Integer.valueOf(pieces[1]);

            if (age > oldest) {
                oldest = Integer.valueOf(pieces[1]);
                name = pieces[0];
            }
        }

        System.out.println("Name of the oldest: " + name);
    }
}
