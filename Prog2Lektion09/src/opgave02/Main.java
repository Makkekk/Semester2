package opgave02;

public class Main {
    public static void main(String[] args) {
        double[][] input = {
                {1, 0, 3, 4.0},
                {5, 0, 7, 8},
                {9, 10, 0, 10},
                {13, 14, 15, 0}
        };
        System.out.println(countZerosOnMajorDiagonal(input));
    }

    private static int countZerosOnMajorDiagonal(double[][] input) {
        int n = input.length; // assuming square matrix
        if (n == 0) return 0;
        return countZerosRecursive(input, 0, n - 1);
    }

    private static int countZerosRecursive(double[][] input, int start, int end) {
        if (start == end) {
            if (input[start][start] == 0) {
                return 1;
            } else {
                return 0;
            }
        }
        int mid = (start + end) / 2;
        int leftCount = countZerosRecursive(input, start, mid);
        int rightCount = countZerosRecursive(input, mid + 1, end);
        return leftCount + rightCount;
    }
}
