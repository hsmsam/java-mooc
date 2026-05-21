package part7.LiquidContainers2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        int containerLimit = 100;

        while (true) {
            System.out.println("First: " + firstContainer.toString());
            System.out.println("Second: " + secondContainer.toString());

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
                if (amount < 0) {
                    amount = 0;
                }

                int moveAmount = 0;

                if (amount > firstContainer.contains()) {
                    moveAmount = firstContainer.contains();
                } else {
                    moveAmount = amount;
                }

                firstContainer.remove(moveAmount);
                secondContainer.add(moveAmount);

                if (secondContainer.contains() > containerLimit) {
                    secondContainer.add(containerLimit);
                }
            }

            if (command.equals("remove")) {
                secondContainer.remove(amount);
            }
        }
    }
}
