package opgave02;

public class Opgave02 {
    public static void main(String[] args) {

        String valid = "(3+{5{99{*}}[23[{67}67]]})";
        String invalid = "(}){";

        System.out.println("Tjekker streng: " + valid);
        if (ParentesChecker.checkParantes(valid)) {
            System.out.println("Resultat: Gyldig parentes-struktur");
        } else {
            System.out.println("Resultat: Ugyldig parentes-struktur");
        }

        System.out.println("Tjekker streng: " + invalid);
        if (ParentesChecker.checkParantes(invalid)) {
            System.out.println("Resultat: Gyldig parentes-struktur");
        } else {
            System.out.println("Resultat: Ugyldig parentes-struktur");
        }
    }
}

