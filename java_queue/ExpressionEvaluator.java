class CharStack {
    private char[] stack;
    private int top;

    CharStack(int size) {
        stack = new char[size];
        top = -1;
    }

    void push(char c) {
        stack[++top] = c;
    }

    char pop() {
        return stack[top--];
    }

    char peek() {
        return stack[top];
    }

    boolean isEmpty() {
        return top == -1;
    }
}

class IntStack {
    private int[] stack;
    private int top;

    IntStack(int size) {
        stack = new int[size];
        top = -1;
    }

    void push(int val) {
        stack[++top] = val;
    }

    int pop() {
        return stack[top--];
    }

    boolean isEmpty() {
        return top == -1;
    }
}

public class ExpressionEvaluator {

    static int precedence(char op) {
        if (op == '+' || op == '-') return 1;
        if (op == '*' || op == '/') return 2;
        return 0;
    }

    static String infixToPostfix(String expr) {
        StringBuilder result = new StringBuilder();
        CharStack stack = new CharStack(expr.length());
        int i = 0;

        while (i < expr.length()) {
            char c = expr.charAt(i);

            if (Character.isDigit(c)) {
                while (i < expr.length() && Character.isDigit(expr.charAt(i))) {
                    result.append(expr.charAt(i));
                    i++;
                }
                result.append(' ');
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result.append(stack.pop()).append(' ');
                }
                stack.push(c);
                i++;
            } else {
                i++;
            }
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop()).append(' ');
        }

        return result.toString().trim();
    }

    static int evaluatePostfix(String postfix) {
        IntStack stack = new IntStack(postfix.length());
        String[] tokens = postfix.split(" ");

        for (String token : tokens) {
            if (token.matches("-?\\d+")) {
                stack.push(Integer.parseInt(token));
            } else {
                int b = stack.pop();
                int a = stack.pop();
                switch (token.charAt(0)) {
                    case '+': stack.push(a + b); break;
                    case '-': stack.push(a - b); break;
                    case '*': stack.push(a * b); break;
                    case '/': stack.push(a / b); break;
                }
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String infix = "12+3*4-6";
        String postfix = infixToPostfix(infix);
        System.out.println("Postfix: " + postfix);
        int result = evaluatePostfix(postfix);
        System.out.println("Result: " + result);
    }
}
