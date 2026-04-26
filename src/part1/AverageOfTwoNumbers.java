package part1;

import java.util.Scanner;

public class AverageOfTwoNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondNumber = Integer.valueOf(scanner.nextLine());

        double sum = firstNumber + secondNumber ;
        double average = sum /  2;
        System.out.println("The average is " + average);
    }
}
