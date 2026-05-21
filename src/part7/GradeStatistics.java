package part7;

import java.util.Scanner;

public class GradeStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int passCounter = 0;
        double allSum = 0;
        double passSum = 0;
        double average = 0;
        double passAverage = 0;
        double passPercentage = 0;
        int grade0 = 0;
        int grade1 = 0;
        int grade2 = 0;
        int grade3 = 0;
        int grade4 = 0;
        int grade5 = 0;

        System.out.println("Enter points totals, -1 stops:");

        while (true) {
            int points = Integer.valueOf(scanner.nextLine());

            if (points == -1) {
                break;
            }

            if (points >= 0 && points <= 100) {
                allSum += points;
                if (points < 50) {
                    grade0++;
                }
                counter++;
            }
            if (points >= 50 && points <= 100) {
                passSum += points;
                if (points < 60) {
                    grade1++;
                } else if (points < 70) {
                    grade2++;
                } else if (points < 80) {
                    grade3++;
                } else if (points < 90) {
                    grade4++;
                } else {
                    grade5++;
                }
                passCounter++;
            }
        }

        average = allSum / counter;
        passAverage = passSum / passCounter;
        passPercentage = (double) (100 * passCounter) / counter;

        System.out.println("Point average (all): " + average);

        if (passCounter == 0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + passAverage);
        }
        System.out.println("Pass percentage: " + passPercentage);
        System.out.println("Grade distribution: ");
        System.out.println("5: " + "*".repeat(grade5));
        System.out.println("4: " + "*".repeat(grade4));
        System.out.println("3: " + "*".repeat(grade3));
        System.out.println("2: " + "*".repeat(grade2));
        System.out.println("1: " + "*".repeat(grade1));
        System.out.println("0: " + "*".repeat(grade0));
    }
}
