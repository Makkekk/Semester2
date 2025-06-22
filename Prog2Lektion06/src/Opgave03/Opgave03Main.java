package Opgave03;

public class Opgave03Main {
    public static void main(String[] args) {
    }

    public static int power(int n, int p) {
        if (p < 0) {
            throw new IllegalArgumentException("Power must be non-negative");
        }
        if (p == 0) {
            return 1; //termineringsregel
        }

        if (p % 2 == 0) {
            // p er lige: brug (n^2)^(p/2)
            return power(n * n, p / 2);
        } else {
            // p er ulige: brug n^(p-1) * n
            return n * power(n, p - 1);
        }
    }
}

