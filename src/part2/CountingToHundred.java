package part2;

import java.util.Scanner;

public class CountingToHundred {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int i = 100;
        int number = Integer.valueOf(scanner.nextLine());

        while(number <= i){
            System.out.println(number);
            number ++;
        }
    }
}
