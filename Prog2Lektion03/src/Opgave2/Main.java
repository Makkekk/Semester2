package Opgave2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Customer[] customers = {
                new Customer("Alice", "Kisbæk", 12),
                new Customer("Bob", "Jensen", 15),
                new Customer("Charlie", "Nielsen", 24),
                new Customer("Diana", "Hansen", 30),
                new Customer("Eva", "Olsen", 18),
        };

        Customer last = lastCustomer(customers);
        System.out.println("Sidste kunde: " + last.getFornavn() + " " + last.getEfternavn() + " , " + last.getAlder() + " år gammel");

        Customer bente = customers[0];
        Customer[] after = afterCustomer(customers, bente);
        for (Customer customer : after) {
            System.out.println(customer.getFornavn() + " " + customer.getEfternavn());

        }
    }

    public static Customer lastCustomer(Customer[] customers) {
        if (customers == null || customers.length == 0) return null;
        Customer last = customers[0];
        for (int i = 1; i < customers.length; i++) {
            if (customers[i].compareTo(last) > 0) {
                last = customers[i];
            }
        }
        return last;
    }

    public static Customer[] afterCustomer(Customer[] customers, Customer customer) {
        if (customers == null || customer == null) return new Customer[0];
        List<Customer> result = new ArrayList<>();
        for (Customer c : customers) {
            if (c.compareTo(customer) > 0) {
                result.add(c);
            }
        }
        return result.toArray(new Customer[0]);
    }
}



