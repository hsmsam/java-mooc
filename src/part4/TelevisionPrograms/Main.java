package part4.TelevisionPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TelevisionProgram> shows = new ArrayList<>();

        while (true) {
            System.out.print("Name: ");
            String showName = scanner.nextLine();

            if (showName.isEmpty()) {
                break;
            }

            System.out.print("Duration: ");
            int showDuration = Integer.valueOf(scanner.nextLine());

            shows.add(new TelevisionProgram(showName, showDuration));
        }

        System.out.println();
        System.out.print("Program's maximum duration? ");
        int maximumDuration = Integer.valueOf(scanner.nextLine());

        for (TelevisionProgram show : shows) {
            if (show.getShowDuration() <= maximumDuration) {
                System.out.println(show);
            }
        }
    }
}
