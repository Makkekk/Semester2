package opgave01;

import com.sun.javafx.image.IntPixelGetter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(List.of(32, 23, 13, -22, 202, 42, 53, 0));
        System.out.println("Antal lige tal = " + numberOfEvenNumbers(integers));
    }

    private static int numberOfEvenNumbers(ArrayList<Integer> integers) {
        return countEven(integers, 0);
    }

    private static int countEven(ArrayList<Integer> integers, int index) {
        if (index >= integers.size()) {
            return 0;
        }
        int count = 0;
        if (integers.get(index) % 2 == 0) {
            count = 1;
        }
        return count + countEven(integers, index + 1);
    }
}
