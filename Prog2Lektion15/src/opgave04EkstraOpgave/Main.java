package opgave04EkstraOpgave;

public class Main {
    public static void main(String[] args) {
        PostFixEvaluator evaluator = new PostFixEvaluator();

        String input = "12 2 5 + - 4 * 2 /";  // Skal give: ((12 - (2 + 5)) * 4) / 2 = 10
        int result = evaluator.evaluate(input);

        System.out.println("Resultat: " + result); // → Resultat: 10
    }
}
