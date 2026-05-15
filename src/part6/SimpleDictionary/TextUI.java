package part6.SimpleDictionary;

import java.util.ArrayList;
import java.util.Scanner;

public class TextUI {
    SimpleDictionary dictionary;
    Scanner scanner = new Scanner(System.in);

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("end")) {
                break;
            } else if (command.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String tranlsation = scanner.nextLine();

                dictionary.add(word, tranlsation);

            } else if (command.equals("search")) {
                System.out.print("To be translated: ");
                String word = scanner.nextLine();

                if (dictionary.translate(word) != null) {
                    System.out.println("Translation: " + dictionary.translate(word));
                } else {
                    System.out.println("Word " + word + " was not found");
                }

            } else {
                System.out.println("Unknown command");
            }
        }
        System.out.println("Bye bye!");
    }
}
