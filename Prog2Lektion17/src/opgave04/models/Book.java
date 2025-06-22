package opgave04.models;

import opgave04.Observer;

import java.util.ArrayList;
import java.util.List;

public class Book implements Subject{
    private final String title; // not empty
    private int count;
    private List<Customer> boughtBy = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public Book(String title) {
        this.title = title;
        this.count = 0;
    }

    public String getTitle() {
        return title;
    }

    public int getCount() {
        return count;
    }

    public void incCount(int amount) {
        count += amount;
    }

    public void decCount(int amount) {
        count -= amount;
    }

    public void addCustomer(Customer customer) {
        if (!boughtBy.contains(customer)) {
            boughtBy.add(customer);
        }
    }

    public List<Customer> getBoughtBy() {
        return boughtBy;
    }



    @Override
    public String toString() {
        return title + "(" + count + ")";
    }

    // Observer Pattern methods
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(Book book, Customer customer) {
        for (Observer o : observers) {
            o.update(book, customer);
        }
    }
}