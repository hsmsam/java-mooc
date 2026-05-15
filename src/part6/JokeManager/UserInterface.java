package part6.JokeManager;

import java.util.Scanner;

public class UserInterface {
    Scanner scanner;
    JokeManager manager;

    public UserInterface(JokeManager manager, Scanner scanner) {
        this.manager = manager;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Commands : \n1 - add a joke \n2 - draw a joke \n3 - list jokes \nX - stop \n");
            String command = scanner.nextLine();

            if (command.equals("X")) {
                break;
            }

            if (command.equals("1")) {
                System.out.println("Write the joke to be added: ");
                String joke = scanner.nextLine();

                manager.addJoke(joke);
            } else if (command.equals("2")) {
                System.out.println(manager.drawJoke());
            } else if (command.equals("3")) {
                System.out.println("Printing the jokes.");
                manager.printJokes();
            }
        }
    }
}
