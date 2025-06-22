package opgave04.models;

import opgave04.Observer;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Salesman implements Observer {
    private final String name; // not empty

    public Salesman(String name) {
        this.name = name;
    }

    @Override
    public void update(Book purchasedBook, Customer buyer) {
        System.out.println("Salesman " + name + " notified: " + buyer.getName() + " bought '" + purchasedBook.getTitle() + "'.");

        // Find all other customers who bought this book
        List<Customer> otherCustomers = purchasedBook.getBoughtBy();

        Set<Book> relatedBooks = new HashSet<>();
        for (Customer c : otherCustomers) {
            if (!c.equals(buyer)) {
                relatedBooks.addAll(c.getBoughtBooks());
            }
        }
        // Fjern den bog, der netop blev købt
        relatedBooks.remove(purchasedBook);

        // Print listen uden dubletter
        System.out.println("Other books bought by customers who also bought '" + purchasedBook.getTitle() + "':");
        for (Book b : relatedBooks) {
            System.out.println(" - " + b.getTitle());
        }

        System.out.println(); // Line break
    }
}