package part2;

import java.util.Scanner;

public class SquareRootOfSum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.valueOf(scanner.nextLine());
        int number2 = Integer.valueOf(scanner.nextLine());
        double squareRoot1 = Math.sqrt(number1);
        double squareRoot2 = Math.sqrt(number2);
        double sumOfSquareRoots = squareRoot1 + squareRoot2;
        System.out.println((int)sumOfSquareRoots);
    }
}
