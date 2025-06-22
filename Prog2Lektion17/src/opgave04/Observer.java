package opgave04;

import opgave04.models.Book;
import opgave04.models.Customer;

public interface Observer {
    void update(Book Book, Customer customer);
}