package part10.Literature;

public class Book implements Comparable<Book> {
    private String bookName;
    private int ageRecommendation;

    public Book(String bookName, int ageRecommendation) {
        this.bookName = bookName;
        this.ageRecommendation = ageRecommendation;
    }

    public String getBookName() {
        return bookName;
    }

    public int getAgeRecommendation() {
        return ageRecommendation;
    }

    public String toString() {
        return bookName + " (recommended for " + ageRecommendation + " year-olds or older)";
    }

    @Override
    public int compareTo(Book book) {
        return Integer.compare(this.ageRecommendation, book.ageRecommendation);
    }
}
