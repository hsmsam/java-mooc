package part1;

import java.util.Scanner;

public class SecondsInADay {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("How manys days would you like to convert to seconds?");
        int days = Integer.valueOf(scanner.nextLine());
        int secondsInDays = days * 86400 ;
        System.out.println(secondsInDays);
    }
}
