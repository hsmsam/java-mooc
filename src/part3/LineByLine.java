package part3;

import java.util.Scanner;

public class LineByLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String string = scanner.nextLine();

            if (string.isEmpty()) {
                break;
            }

            String pieces[] = string.split(" ");

            for (int i = 0; i < pieces.length; i++) {
                System.out.println(pieces[i]);
            }
        }
    }
}