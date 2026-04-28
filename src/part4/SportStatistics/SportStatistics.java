package part4.SportStatistics;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        ArrayList<String> teams = new ArrayList<>();
        int games = 0;
        int wins = 0;
        int losses = 0;

        System.out.println("File: ");
        String file = scanner1.nextLine();
        String path = "src/part4/SportStatistics/" + file;

        System.out.println("Team: ");
        String team = scanner1.nextLine();

        try (Scanner scanner = new Scanner(Paths.get(path))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String awayTeam = parts[1];

                int homeTeamPoints = Integer.valueOf(parts[2]);
                int awayTeamPoints = Integer.valueOf(parts[3]);

                teams.add(homeTeam);
                teams.add(awayTeam);

                if (homeTeam.equals(team) && homeTeamPoints > awayTeamPoints) {
                    wins++;
                } else if (homeTeam.equals(team) && homeTeamPoints < awayTeamPoints) {
                    losses++;
                }

                if (awayTeam.equals(team) && awayTeamPoints > homeTeamPoints) {
                    wins++;
                } else if (awayTeam.equals(team) && awayTeamPoints < homeTeamPoints) {
                    losses++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        for (int i = 0; i < teams.size(); i++) {
            if (teams.get(i).equals(team)) {
                games += 1;
            }
        }

        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
}
