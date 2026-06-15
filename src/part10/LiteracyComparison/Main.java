package part10.LiteracyComparison;


import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(Paths.get("src/part10/LiteracyComparison/literacy.csv"))) {
            List<LiteracyData> literacyRates = new ArrayList<>();

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] parts = line.split(",");
                String theme = parts[0];
                String ageGroup = parts[1];
                String gender = parts[2];
                String country = parts[3];
                int year = Integer.parseInt(parts[4]);
                double literacyPercent = Double.parseDouble(parts[5]);

                LiteracyData newEntry = new LiteracyData(country, year, gender, literacyPercent);
                literacyRates.add(newEntry);
            }

            literacyRates.sort(Comparator.comparingDouble(value -> value.literacyPercent));

            literacyRates
                    .forEach(value -> System.out.println(value));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
