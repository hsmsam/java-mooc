package part10.RegularExpressions;

public class Checker {
    private String string;

    public Checker() {
    }

    public boolean isDayOfWeek(String string) {
        if (string.matches("mon|tue|wed|thu|fri|sat|sun")) {
            System.out.println("The form is correct.");
            return true;
        }
        System.out.println("The form is incorrect.");
        return false;
    }

    public boolean allVowels(String string) {
        return string.matches("[aeiou]+");
    }

    public boolean timeOfDay(String string) {
        if (!string.matches("\\d{2}:\\d{2}:\\d{2}")) {
            return false;
        }

        String[] parts = string.split(":");

        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        int seconds = Integer.parseInt(parts[2]);

        return hours >= 0 && hours <= 23
                && minutes >= 0 && minutes <= 59
                && seconds >= 0 && seconds <= 59;
    }
}
