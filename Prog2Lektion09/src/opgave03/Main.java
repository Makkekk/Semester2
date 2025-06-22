package opgave03;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Test 1: locateSmallest
        double[][] input = {
                {23.5, 35, 2, 10},
                {4.5, 3, 45, 3.5},
                {35, 44, 5.5, 9.6}
        };
        int[] result = locateSmallest(input);
        System.out.println("Mindste tal er i " + result[0] + ", " + result[1]); // Forvent: 0, 2

        // Test 2: countStringsOfLength
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hej");
        strings.add("Verden");
        strings.add("Mads");
        strings.add("Maj");
        strings.add("ABC");
        int count = countStringsOfLength(strings, 3);
        System.out.println("Antal strenge med længde 3: " + count); // Forvent: 3

        // Test 3: printElementsOfLength
        System.out.println("Strenge med længde 4:");
        printElementsOfLength(strings, 4); // Forvent: "Mads"

        // Test 4: elementsOfLength
        ArrayList<String> resultList = elementsOfLength(strings, 5);
        System.out.println("Strenge med længde 5:");
        for (String s : resultList) {
            System.out.println(s); // Forvent: "Verden" (hvis fejltælling), ellers tom hvis ingen
        }
    }

    private static int[] locateSmallest(double[][] input) {
        return locateSmallestRecursive(input, 0, input.length - 1);
    }

    private static int[] locateSmallestRecursive(double[][] input, int topRow, int bottomRow) {
        if (topRow == bottomRow) {
            return findMinInRow(input[topRow], topRow);
        }

        int mid = (topRow + bottomRow) / 2;
        int[] minTop = locateSmallestRecursive(input, topRow, mid);
        int[] minBottom = locateSmallestRecursive(input, mid + 1, bottomRow);

        double topVal = input[minTop[0]][minTop[1]];
        double bottomVal = input[minBottom[0]][minBottom[1]];

        return topVal < bottomVal ? minTop : minBottom;
    }

    private static int[] findMinInRow(double[] row, int rowIndex) {
        int colIndex = 0;
        double min = row[0];
        for (int i = 1; i < row.length; i++) {
            if (row[i] < min) {
                min = row[i];
                colIndex = i;
            }
        }
        return new int[]{rowIndex, colIndex};
    }

    public static int countStringsOfLength(ArrayList<String> strings, int length) {
        return countStringsOfLengthRecursive(strings, 0, strings.size() - 1, length);
    }

    private static int countStringsOfLengthRecursive(ArrayList<String> strings, int left, int right, int length) {
        if (left > right) return 0;
        if (left == right) {
            if (strings.get(left).length() == length) return 1;
            else return 0;
        }

        int mid = (left + right) / 2;
        int countLeft = countStringsOfLengthRecursive(strings, left, mid, length);
        int countRight = countStringsOfLengthRecursive(strings, mid + 1, right, length);
        return countLeft + countRight;
    }

    public static void printElementsOfLength(ArrayList<String> strings, int length) {
        printElementsOfLengthRecursive(strings, 0, strings.size() - 1, length);
    }

    private static void printElementsOfLengthRecursive(ArrayList<String> strings, int left, int right, int length) {
        if (left > right) return;
        if (left == right) {
            if (strings.get(left).length() == length) {
                System.out.println(strings.get(left));
            }
            return;
        }

        int mid = (left + right) / 2;
        printElementsOfLengthRecursive(strings, left, mid, length);
        printElementsOfLengthRecursive(strings, mid + 1, right, length);
    }
    public static ArrayList<String> elementsOfLength(ArrayList<String> strings, int length) {
        return elementsOfLengthRecursive(strings, 0, strings.size() - 1, length);
    }

    private static ArrayList<String> elementsOfLengthRecursive(ArrayList<String> strings, int left, int right, int length) {
        ArrayList<String> result = new ArrayList<>();
        if (left > right) return result;

        if (left == right) {
            if (strings.get(left).length() == length) {
                result.add(strings.get(left));
            }
            return result;
        }

        int mid = (left + right) / 2;
        ArrayList<String> leftList = elementsOfLengthRecursive(strings, left, mid, length);
        ArrayList<String> rightList = elementsOfLengthRecursive(strings, mid + 1, right, length);
        leftList.addAll(rightList);
        return leftList;
    }

}