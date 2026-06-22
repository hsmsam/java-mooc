package part12;

import java.util.Random;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("How many random numbers should be printed?");
        int number = scanner.nextInt();

        int i = 1;
        while (i <= number) {
            int randomNumber = random.nextInt(11);
            System.out.println(randomNumber);
            i++;
        }
    }
}
