package part4.NumbersFromAFile;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int index = 0;

        System.out.print("File? ");
        String file = scanner1.nextLine();
        String path = "src/part4/NumbersFromAFile/" + file;

        try (Scanner scanner = new Scanner(Paths.get(path))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                numbers.add(Integer.valueOf(row));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.print("Lower bound? ");
        int lower = Integer.valueOf(scanner1.nextLine());
        System.out.print("Upper bound? ");
        int upper = Integer.valueOf(scanner1.nextLine());

        for (Integer number : numbers) {
            if (number >= lower && number <= upper) {
                index += 1;
            }
        }
        System.out.println("Numbers: " + index);
    }
}
