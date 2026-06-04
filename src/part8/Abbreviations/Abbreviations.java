package part8.Abbreviations;

import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbreviations = new HashMap<>();

    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        abbreviations.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        boolean hasAbbreviation = false;

        if (abbreviations.containsKey(abbreviation)) {
            hasAbbreviation = true;
        }

        return hasAbbreviation;
    }

    public String findExplanationFor(String abbreviation) {
        if (abbreviations.containsKey(abbreviation)) {
            return abbreviations.get(abbreviation);
        }
        return null;
    }
}
