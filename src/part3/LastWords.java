package part3;

import java.util.Scanner;

public class LastWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lastWord = "";

        while (true) {
            String string = scanner.nextLine();
            String[] pieces = string.split(" ");
            lastWord = pieces[pieces.length - 1];

            if (string.isEmpty()) {
                break;
            }
            System.out.println(lastWord);
        }
    }
}
