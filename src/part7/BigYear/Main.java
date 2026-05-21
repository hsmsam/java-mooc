package part7.BigYear;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<>();

        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();

            if (command.equals("Quit")) {
                break;
            }

            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();

                System.out.print("Name in Latin: ");
                String latinName = scanner.nextLine();

                Bird bird = new Bird(name, latinName);
                birds.add(bird);
            }

            if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String name = scanner.nextLine();
                boolean found = false;

                for (Bird bird : birds) {
                    if (bird.getName().equals(name)) {
                        found = true;
                        bird.observation();
                    }
                }
                if (found == false) {
                    System.out.println("Not a bird!");
                }
            }

            if (command.equals("All")) {
                for (Bird bird : birds) {
                    System.out.println(bird);
                }
            }

            if (command.equals("One")) {
                System.out.print("Bird? ");
                String name = scanner.nextLine();

                for (Bird bird : birds) {
                    if (bird.getName().equals(name)) {
                        System.out.println(bird);
                    }
                }
            }
        }
    }
}
