package part3;

import java.util.Scanner;

public class AgeOfTheOldest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        int oldest = 0;

        while (true) {
            String string = scanner.nextLine();

            if (string.isEmpty()) {
                break;
            }
            String[] pieces = string.split(",");

            age = Integer.valueOf(pieces[1]);

            if (age > oldest) {
                oldest = Integer.valueOf(pieces[1]);
            }
        }
        System.out.println("Age of the oldest: " + oldest);
    }
}

