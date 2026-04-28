package part4.RecordsFromAFile;

import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Name of the file: ");
        String file = scanner1.nextLine();
        String path = "src/part4/RecordsFromAFile/" + file;

        try (Scanner scanner = new Scanner(Paths.get(path))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);

                if (age > 1) {
                    System.out.println(name + ", age: " + age + " years");
                } else {
                    System.out.println(name + ", age: " + age + " year");
                }

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}
