package opgave03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(List.of("Janus", "Markus", "Peter", "Line", "Mads", "Søren", "Mathias", "Trine", "Anders"));
        int number = countStringsOfLength(names, 5);
        System.out.println("number = " + number);
        System.out.println();
        printElementsOfLength(names, 5);
        System.out.println();
        System.out.println("Navne med længde = 5 : " + elementsOfLength(names, 5));
    }


    /**
     * @param strings ArrayList of elements
     * @param length the length to test for
     * @return the number of elements in strings with the specified length
     */
    public static int countStringsOfLength(ArrayList<String> strings, int length) {
        //TODO
        return 0;
    }


    /**
     * Writes the elements of strings to the console with the specified lenght
     * @param strings ArrayList of elements
     * @param length the length to test for
     */
    public static void printElementsOfLength(ArrayList<String> strings, int length) {
        //TODO
    }

    /**
     *
     * @param strings ArrayList of elements
     * @param length the length to test for
     * @return a new ArrayList with all elements from strings with the specified lenght
     */
    public static ArrayList<String> elementsOfLength(ArrayList<String> strings, int length) {
        //TODO
        return null;
    }
}