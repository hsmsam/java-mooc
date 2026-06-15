package part10.RegularExpressions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Checker checker = new Checker();

        System.out.print("Enter a string: ");
        String string = scanner.nextLine();

        System.out.println(checker.allVowels(string));

        if (checker.allVowels(string)) {
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }
    }
}
