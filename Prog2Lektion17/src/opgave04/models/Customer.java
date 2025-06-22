package opgave04.models;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final String name;
    private List<Book> boughtBooks = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addBook(Book book) {
        if (!boughtBooks.contains(book)) {
            boughtBooks.add(book);
        }
    }

    public List<Book> getBoughtBooks() {
        return boughtBooks;
    }

    @Override
    public String toString() {
        return name;
    }
}