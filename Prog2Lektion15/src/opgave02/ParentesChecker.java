package opgave02;

import java.util.Stack;

public class ParentesChecker {

    public static boolean checkParantes(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c); // Læg åben parantes på stacken
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false; // Der er en lukke-parantes uden en åbning
                }

                char top = stack.pop();
                if (!matches(top, c)) {
                    return false; // Forkert match
                }
            }
        }

        return stack.isEmpty(); // Hvis der er åbne paranteser tilbage, returner false
    }

    private static boolean matches(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
}
