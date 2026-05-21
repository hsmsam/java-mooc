package part7;

import java.util.Scanner;

public class LiquidContainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstContainer = 0;
        int secondContainer = 0;
        int containerLimit = 100;

        while (true) {
            System.out.println("First: " + firstContainer + "/" + containerLimit);
            System.out.println("Second: " + secondContainer + "/" + containerLimit);

            String input = scanner.nextLine();
            String[] parts = input.split(" ");

            String command = parts[0];

            if (command.equals("quit")) {
                break;
            }

            int amount = Integer.parseInt(parts[1]);

            if (command.equals("add")) {
                if (amount > 0) {
                    if (firstContainer + amount > containerLimit) {
                        firstContainer = containerLimit;
                    } else {
                        firstContainer += amount;
                    }
                }
            }

            if (command.equals("move")) {
                if (amount < 0) {
                    amount = 0;
                }

                int moveAmount;

                if (amount > firstContainer) {
                    moveAmount = firstContainer;
                } else {
                    moveAmount = amount;
                }

                firstContainer -= moveAmount;
                secondContainer += moveAmount;

                if (secondContainer > containerLimit) {
                    secondContainer = containerLimit;
                }
            }

            if (command.equals("remove")) {
                if (amount > secondContainer) {
                    secondContainer = 0;
                } else {
                    secondContainer -= amount;
                }
            }
        }
    }
}
