package part10.LiteracyComparison;

public class LiteracyData implements Comparable<LiteracyData> {
    private String country;
    private int year;
    private String gender;
    double literacyPercent;

    public LiteracyData(String country, int year, String gender, double literacyPercent) {
        this.country = country;
        this.year = year;
        this.gender = gender.replace(" (%)", "").trim();
        this.literacyPercent = literacyPercent;
    }

    public String toString() {
        return country + " (" + year + "), " + gender + ", " + literacyPercent;
    }

    @Override
    public int compareTo(LiteracyData object) {
        if (this.literacyPercent == object.literacyPercent) {
            return 0;
        }
        if (this.literacyPercent < object.literacyPercent) {
            return -1;
        }
        return 1;
    }
}
