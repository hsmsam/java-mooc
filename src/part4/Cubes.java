package part4;

import java.util.Scanner;

public class Cubes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cubed = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            int number = Integer.valueOf(input);
            cubed = number * number * number;


            System.out.println(cubed);

        }
    }
}
