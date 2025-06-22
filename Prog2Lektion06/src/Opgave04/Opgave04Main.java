package Opgave04;

    public class Opgave04Main {
        //Termeneringsregel: Hvis længden af Strengen er 0, er den allerede vendt
        //Rekurensregel: Den første karakter i strengen + reverse af resten af strengen


        public static void main(String[] args) {
            System.out.println(reverse("eirefretniV"));  // Output: Vinterferie
            System.out.println(reverse("abc"));          // Output: cba
        }

        public static String reverse(String s) {
            if (s.isEmpty()) {
                throw new IllegalArgumentException("input string kan ikke være null");// Returner den tomme streng, hvis input er tomt
            }
            if (s.length() <= 1) {
                return s; // Hvis strengen kun har én karakter, returner den
            }

            return reverse(s.substring(1)) + s.charAt(0); // Rekursivt kald: vend resten af strengen og tilføj den første karakter til slutningen

        }


    }
