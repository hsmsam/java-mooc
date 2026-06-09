package part9.InterfaceInABox;

public class CD implements Packable {
    private String artist;
    private String cdName;
    private int publicationYear;
    private double weight;

    public CD(String artist, String cdName, int publicationYear) {
        this.artist = artist;
        this.cdName = cdName;
        this.publicationYear = publicationYear;
    }

    @Override
    public double weight() {
        return 0.1;
    }

    @Override
    public String toString() {
        return artist + ": " + cdName + " (" + publicationYear + ")";
    }
}
