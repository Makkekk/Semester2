package opgave01;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Opgave01 {
    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>(List.of(34, 12, 23, 45, 67, 34, 98 ));

        System.out.println("mySet = " + mySet);

        mySet.add(23); // Adding a duplicate value

        System.out.println("mySet after adding a duplicate = " + mySet);

        mySet.remove(67); // Removing an element

        boolean has23 = mySet.contains(23); // Checking if an element exists
        System.out.println("Does mySet contain 23? " + has23);
    }
}