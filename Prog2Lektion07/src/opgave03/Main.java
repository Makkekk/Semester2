package opgave03;

public class Main {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            System.out.println(i + " : " + threeXPlusOne(i));
        }
    }

    private static int threeXPlusOne(int n) {
            if (n <= 0) {
                throw new IllegalArgumentException("n skal være et positivt heltal");
            }
            if (n == 1) {
                return 0;  // Stop, vi er nået til 1
            }
            if (n % 2 == 0) {  // n er lige
                return 1 + threeXPlusOne(n / 2);
            } else {           // n er ulige
                return 1 + threeXPlusOne(3 * n + 1);
            }
        }
    }