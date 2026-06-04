package part8.LiquidContainers2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);

            String input = scanner.nextLine();

            String[] parts = input.split(" ");
            String command = parts[0];

            if (command.equals("quit")) {
                break;
            }

            int amount = Integer.parseInt(parts[1]);

            if (command.equals("add")) {
                firstContainer.add(amount);
            }

            if (command.equals("move")) {
                int amountToMove = amount;

                if (amount > firstContainer.contains()) {
                    amountToMove = firstContainer.contains();
                }
                firstContainer.remove(amountToMove);
                secondContainer.add(amountToMove);
            }

            if (command.equals("remove")) {
                secondContainer.remove(amount);
            }
        }
    }
}
