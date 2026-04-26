package part2;

import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        int number = Integer.valueOf(scanner.nextLine());

        while (i <= number) {
            System.out.println(i);
            i++;
        }
    }
}
