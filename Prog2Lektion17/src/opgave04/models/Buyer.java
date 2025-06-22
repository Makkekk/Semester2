package opgave04.models;

import opgave04.Observer;

public class Buyer implements Observer {
    private final String name; // not empty

    public Buyer(String name) {
        this.name = name;
    }

    public void buyBook(Book book, int amount) {
        book.incCount(amount);
        System.out.println("Buyer " + name + ": " + book + ", " + amount + " copies");
    }
    @Override
    public void update(Book book, Customer customer) {
        if(book.getCount() < 5) {
            buyBook(book,10);
        }

        // Find the Book object by title if needed
        // But we assume Buyer is registered per-book and has access to the object directly.
        // So we’ll use a workaround where we store reference to the book via anonymous class or inner logic.
        // Simplest is for Buyer to have a reference to the Book when it registers.

        // Buyer doesn't act here, the Book should notify with itself (see next step)
    }
}