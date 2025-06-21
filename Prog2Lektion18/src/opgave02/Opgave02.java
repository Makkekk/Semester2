package opgave02;

import opgave02.primenumbers.SieveOfEratosthenes;

public class Opgave02 {
    public static void main(String[] args) {

        SieveOfEratosthenes sieve = new SieveOfEratosthenes();
        sieve.findPrimeNumbers(10000000);
    }
}