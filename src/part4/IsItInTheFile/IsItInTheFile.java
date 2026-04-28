package part4.IsItInTheFile;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Name of the file: ");
        String input = scanner1.nextLine();
        String path = "src/part4/IsItInTheFile/" + input;

        try (Scanner scanner = new Scanner(Paths.get(path))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                list.add(row);
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + input + " failed.");
        }
        System.out.println("Search for:");
        String searchTerm = scanner1.nextLine();

        if (list.contains(searchTerm)) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }
    }
}
