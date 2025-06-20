package opgave02;

public class Main {
    public static void main(String[] args) {
        String palindrom = "ibofobi";
        String notPalindrom = "roller";

        System.out.println("Er " + palindrom + " et palindrom? " + isPalindrom(palindrom));
        System.out.println("Er " + notPalindrom + " et palindrom? " + isPalindrom(notPalindrom));
    }

    private static boolean isPalindrom(String palindrom) {
        return true;
    }
}