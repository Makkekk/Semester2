package opgave04.models;

import opgave04.Observer;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(Book book, Customer customer);
}


