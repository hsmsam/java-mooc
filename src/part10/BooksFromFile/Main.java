package part10.BooksFromFile;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book("Do Androids Dream of Electric Sheep?", 1968, 210, "Philip K. Dick"));
        books.add(new Book("Love in the Time of Cholera", 1985, 348, "Gabriel Garcia Marquez"));

        System.out.println("Manual books:");
        books.forEach(System.out::println);

        List<Book> fileBooks = readBooks("books.csv");

        System.out.println("\nBooks from file:");
        fileBooks.forEach(System.out::println);
    }

    public static List<Book> readBooks(String file) {
        List<Book> books = new ArrayList<>();

        try {
            // reading the "presidents.txt" file line by line
            Files.lines(Paths.get(file))
                    // splitting the row into parts on the ";" character
                    .map(row -> row.split(","))
                    // deleting the split rows that have less than two parts (we want the rows to always contain both the name and the birth year)
                    .filter(parts -> parts.length >= 4)
                    // creating persons from the parts
                    .map(parts -> new Book(parts[0], Integer.parseInt(parts[1]), Integer.parseInt(parts[2]), parts[3]))
                    // and finally add the persons to the list
                    .forEach(book -> books.add(book));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return books;
    }
}
