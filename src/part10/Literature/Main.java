package part10.Literature;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String bookName = scanner.nextLine();

            if (bookName.isEmpty()) {
                break;
            }

            System.out.print("Input the age recommendation: ");
            int ageRecommendation = Integer.parseInt(scanner.nextLine());

            Book book = new Book(bookName, ageRecommendation);
            books.add(book);
        }

        System.out.println();
        System.out.println(books.size() + " books in total.");

        System.out.println("Books");

        Comparator<Book> comparator = Comparator
                .comparing(Book::getAgeRecommendation)
                .thenComparing(Book::getBookName);

        Collections.sort(books,comparator);

        System.out.println();

        for (Book book : books) {
            System.out.println(book);
        }
    }
}
