package part3;

import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        while (true) {
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            names.add(name);
        }
        System.out.print("Search for? ");
        String name = scanner.nextLine();

        if (names.contains(name)) {
            System.out.println(name + " was found!");
        } else {
            System.out.println(name + " was not found!");
        }
    }
}
