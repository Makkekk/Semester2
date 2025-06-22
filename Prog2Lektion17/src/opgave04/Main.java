package opgave04;

import opgave04.models.Book;
import opgave04.models.Buyer;
import opgave04.models.Customer;
import opgave04.models.Salesman;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Opret observatører
        Salesman salesman1 = new Salesman("Svend");
        Salesman salesman2 = new Salesman("Søren");
        Buyer buyer = new Buyer("Benny");

        // Opret bøger og tilføj observatører
        Book donaldDuck = new Book("Donald Duck");
        donaldDuck.registerObserver(salesman1);
        donaldDuck.registerObserver(salesman2);
        donaldDuck.registerObserver(buyer);
        buyer.buyBook(donaldDuck, 6); // Køber 6 stk
        System.out.println();

        Book java = new Book("Java");
        java.registerObserver(salesman1);
        java.registerObserver(buyer);
        buyer.buyBook(java, 8);
        System.out.println();

        Book designPatterns = new Book("Design Patterns");
        designPatterns.registerObserver(salesman1);
        designPatterns.registerObserver(buyer);
        buyer.buyBook(designPatterns, 10);
        System.out.println();

        // Opret kunder
        Customer bob = new Customer("Bob");
        Customer alice = new Customer("Alice");
        Customer harry = new Customer("Harry");

        // Simuler salg
        makeSale(donaldDuck, bob);
        makeSale(donaldDuck, alice);
        makeSale(donaldDuck, harry);

        makeSale(java, bob);
        makeSale(java, alice);
        makeSale(java, harry);

        makeSale(designPatterns, bob);

        // Udskriv kunders køb
        System.out.println("Kundernes køb:");
        for (Customer c : List.of(bob, alice, harry)) {
            System.out.println(c.getName() + " har købt:");
            for (Book b : c.getBoughtBooks()) {
                System.out.println("  - " + b.getTitle());
            }
            System.out.println();
        }
    }

    public static void makeSale(Book book, Customer customer) {
        System.out.println("Sale: " + book + " sold to " + customer.getName());

        book.decCount(1);
        customer.addBook(book);
        book.addCustomer(customer);

        book.notifyObservers(book, customer);
        System.out.println();
    }
}
