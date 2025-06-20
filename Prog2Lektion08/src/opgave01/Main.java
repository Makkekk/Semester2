package opgave01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(List.of(17, 34, -23, 0, 202, 1));
        int sum = sum(integers);
        System.out.println("sum = " + sum);
    }

    private static int sum(ArrayList<Integer> integers) {
        return sum(integers, 0, integers.size() - 1);
    }

    private static int sum(ArrayList<Integer> integers, int left, int right) {
        //TODO
        return 0;
    }
}