package Opgave01;

public class Opgave01Main {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }
    //Termineringsregel 0! = 1
    //Rekursiv regel n! = n * (n-1)! ,n > 0
    public static int factorial(int n) {
        if (n == 0) {
            return 1; // Base case: 0! = 1
        } else {
            return n * factorial(n - 1); // Recursive case: n! = n * (n-1)!
        }
    }
}