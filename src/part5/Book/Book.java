package part5.Book;

public class Book {
    private String authorName;
    private String bookName;
    private int numberOfPages;

    public Book(String authorName, String bookName, int numberOfPages) {
        this.authorName = authorName;
        this.bookName = bookName;
        this.numberOfPages = numberOfPages;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String toString() {
        return authorName + ", " + bookName + ", " + numberOfPages + " pages";
    }
}
