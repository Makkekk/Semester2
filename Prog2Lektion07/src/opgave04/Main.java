package opgave04;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 7, 9, 12, 15, 20};
        int target = 7;

        boolean found = binarySearch(arr, target);
        System.out.println("Findes " + target + " i arrayet? " + found);
    }

    // Hovedmetode der kalder hjælpe-metoden
    public static boolean binarySearch(int[] arr, int target) {
        return binarySearchHelper(arr, target, 0, arr.length - 1);
    }

    // Hjælpe-metode med start og slut indeks
    private static boolean binarySearchHelper(int[] arr, int target, int start, int end) {
        if (start > end) {
            return false; // Basis: interval tomt, tal ikke fundet
        }

        int mid = (start + end) / 2;

        if (arr[mid] == target) {
            return true; // Tal fundet
        } else if (arr[mid] > target) {
            // Søger i venstre halvdel
            return binarySearchHelper(arr, target, start, mid - 1);
        } else {
            // Søger i højre halvdel
            return binarySearchHelper(arr, target, mid + 1, end);
        }
    }
}
