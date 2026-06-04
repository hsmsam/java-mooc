package part8;

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

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);

            if (command.equals("add")) {
                if (amount > 0) {
                    if (firstContainer + amount >= containerLimit) {
                        firstContainer = containerLimit;
                    } else {
                        firstContainer += amount;
                    }
                }
            }

            if (command.equals("move")) {
                if (firstContainer >= amount) {
                    if (secondContainer + amount > containerLimit) {
                        secondContainer = containerLimit;
                    } else {
                        secondContainer += amount;
                    }
                    firstContainer -= amount;
                } else {
                    if (secondContainer + firstContainer > containerLimit) {
                        secondContainer = containerLimit;
                    } else {
                        secondContainer += firstContainer;
                    }
                    firstContainer = 0;
                }
            }

            if (command.equals("remove")) {
                if (amount >= secondContainer) {
                    secondContainer = 0;
                } else {
                    secondContainer -= amount;
                }
            }
        }
    }
}
