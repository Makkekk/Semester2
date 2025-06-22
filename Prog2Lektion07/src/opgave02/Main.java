package opgave02;

public class Main {
    public static void main(String[] args) {
        String palindrom = "ibofobi";
        String notPalindrom = "roller";

        System.out.println("Er " + palindrom + " et palindrom? " + isPalindrom(palindrom));
        System.out.println("Er " + notPalindrom + " et palindrom? " + isPalindrom(notPalindrom));
    }


    //Base case: Hvis left >= right, så er vi nået midten → returnér true.
    // Mismatch: Hvis tegnene ikke matcher → returnér false.
    //Ellers kaldes metoden rekursivt med left + 1 og right - 1.
    private static boolean isPalindrom(String palindrom) {
        return checkPalindrom(palindrom, 0, palindrom.length() - 1);
    }
    private static boolean checkPalindrom(String palindrom, int left, int right) {
        if (left >= right) {
            return true; // Base case: We have checked all characters
        }
        if (palindrom.charAt(left) != palindrom.charAt(right)) {
            return false; // Mismatch found
        }
        return checkPalindrom(palindrom, left + 1, right - 1); // Recursive call
    }
}