package Opgave02;

public class Opgave02Main {
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }

    //termining condition: n == 0 or n == 1
    //recursive case: n > 1 -
    public static int fibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be a positive integer");
        }
        return fibonacciHelper(n, 0, 1);
    }

    private static int fibonacciHelper(int n, int i, int i1) {
        if (n == 0) {
            return i;
        } else if (n == 1) {
            return i1;
        } else {
            return fibonacciHelper(n - 1, i1, i + i1);
        }
    }
}