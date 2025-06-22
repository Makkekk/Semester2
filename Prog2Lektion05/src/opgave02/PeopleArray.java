package opgave02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PeopleArray {
    private List<Person> people = new ArrayList<>();

    public void addPerson(Person person) {
        people.add(person);
    }

    public void printPeople() {
        System.out.println(people);
    }

    /**
     * Returns from the list the first person
     * that satisfies the predicate.
     * Returns null, if no person satisfies the predicate.
     */
    public Person findFirst(Predicate<Person> filter) {
        for (Person person : people) {
            if (filter.test(person)) {
                return person;
            }
        }
        return null;
    }

    public List<Person> findAll(Predicate<Person> filter) {
        List<Person> result = new ArrayList<>();
        for (int i = 0; i < people.size(); i++) {
            if (filter.test(people.get(i))) {
                result.add(people.get(i));
            }
        }
        return result;
    }
}

