package part4.Film;

public class Film {
    String name;
    int ageRating = 0;

    public Film(String fileName, int filmAgeRating) {
        this.name = fileName;
        this.ageRating = filmAgeRating;
    }

    public String name() {
        return name;
    }

    public int ageRating() {
        return ageRating;
    }
}
