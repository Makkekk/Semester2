package opgave04EkstraOpgave;

import java.util.Stack;

public class PostFixEvaluator {

    public int evaluate(String input) {
        if (input == null || input.isBlank()) {
            throw new RuntimeException("Input må ikke være tomt");
        }

        Stack<Integer> stack = new Stack<>();
        String[] tokens = input.trim().split("\\s+");

        for (String token : tokens) {
            if (isNumber(token)) {
                stack.push(Integer.parseInt(token));
            } else if (isOperator(token)) {
                if (stack.size() < 2) {
                    throw new RuntimeException("Ikke nok operander til operator: " + token);
                }

                int b = stack.pop();  // anden operand
                int a = stack.pop();  // første operand

                switch (token) {
                    case "+" -> stack.push(a + b);
                    case "-" -> stack.push(a - b);
                    case "*" -> stack.push(a * b);
                    case "/" -> {
                        if (b == 0) throw new RuntimeException("Division med nul");
                        stack.push(a / b);
                    }
                    default -> throw new RuntimeException("Ugyldig operator: " + token);
                }
            } else {
                throw new RuntimeException("Ugyldigt token: " + token);
            }
        }

        if (stack.size() != 1) {
            throw new RuntimeException("Ugyldigt postfix-udtryk. Stack efter evaluering: " + stack);
        }

        return stack.pop();
    }

    private boolean isNumber(String token) {
        try {
            Integer.parseInt(token);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    private boolean isOperator(String token) {
        return token.matches("[+\\-*/]");
    }
}

