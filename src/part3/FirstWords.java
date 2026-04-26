package part3;

import java.util.Scanner;

public class FirstWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String string = scanner.nextLine();
            String[] pieces = string.split(" ");

            if (string.isEmpty()) {
                break;
            }

            System.out.println(pieces[0]);
        }
    }
}
