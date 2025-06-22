package opgave02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PeopleArrayAsGeneric<T> {
    private List<T> elements = new ArrayList<>();

    public void add(T element) {
        elements.add(element);
    }

    public void printAll() {
        System.out.println(elements);
    }

    /**
     * Returns from the list the first person
     * that satisfies the predicate.
     * Returns null, if no person satisfies the predicate.
     */
    public T findFirst(Predicate<T> filter) {
        for (T element : elements) {
            if (filter.test(element)) {
                return element;
            }
        }
        return null;
    }

    public List<T> findAll(Predicate<T> filter) {
        List<T> result = new ArrayList<>();
        for (int i = 0; i < elements.size(); i++) {
            if (filter.test(elements.get(i))) {
                result.add(elements.get(i));
            }
        }
        return result;
    }
}

