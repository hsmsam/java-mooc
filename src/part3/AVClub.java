package part3;

import java.util.Scanner;

public class AVClub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String string = scanner.nextLine();
            String[] pieces = string.split(" ");

            if (string.isEmpty()) {
                break;
            }

            for (int i = 0; i < pieces.length; i++) {
                if (pieces[i].contains("av")) {
                    System.out.println(pieces[i]);
                }
            }
        }
    }
}
