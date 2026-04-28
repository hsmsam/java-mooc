package part4.Books;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int numberOfPages = Integer.valueOf(scanner.nextLine());

            System.out.print("Publication year: ");
            int publicationYear = Integer.valueOf(scanner.nextLine());

            books.add(new Book(title, numberOfPages, publicationYear));
        }

        System.out.print("What information will be printed? ");
        String informationPrinted = scanner.nextLine();

        for (Book book : books) {
            if (informationPrinted.equals("name")) {
                System.out.println(book.getTitle());
            } else {
                System.out.println(book);
            }
        }
    }
}
