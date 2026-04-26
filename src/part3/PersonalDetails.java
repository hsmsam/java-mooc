package part3;

import java.util.Scanner;

public class PersonalDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int wordLength = 0;
        int longest = 0;
        String name = "";

        while (true) {
            String string = scanner.nextLine();

            if (string.isEmpty()) {
                break;
            }

            String[] pieces = string.split(",");
            sum += Integer.valueOf(pieces[1]);
            count += 1;

            wordLength = pieces[0].length();

            if (wordLength > longest) {
                longest = wordLength;
                name = pieces[0];
            }
        }

        System.out.println("Word length: " + wordLength);
        System.out.println("Longest name: " + name);

        if (count > 0) {
            System.out.println("Average of the birth years: " + 1.0 * sum / count);
        }
    }
}
