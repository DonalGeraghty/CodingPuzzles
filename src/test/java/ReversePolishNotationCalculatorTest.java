import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversePolishNotationCalculatorTest {


    @Test
    @DisplayName("'1 1 +' equals 2")
    public void firstTest() {
        assertEquals(2.0, evaluate("1 1 +"));
    }

    @Test
    @DisplayName("'5 1 2 + 4 * + 3 -' equals 14")
    public void secondTest() {
        assertEquals(14.0, evaluate("5 1 2 + 4 * + 3 -"));
    }


    private double evaluate(String expr) {
        if (expr.equals("")){
            return 0;
        }
        char[] charArray = expr.toCharArray();
        Stack<String> stack = new Stack<>();
        double first;
        double second;
        double result = 0.0;
        for (char c : charArray) {
            if (!String.valueOf(c).equals(" ")) {
                System.out.println("C: " + c);
                if (c == '+' || c == '-' || c == '*' || c == '/') {

                    first = Double.parseDouble(stack.peek());
                    System.out.println("first: " + first);
                    stack.pop();

                    System.out.println("operation: " + c);

                    second = Double.parseDouble(stack.peek());
                    System.out.println("second: " + second);
                    stack.pop();

                    result = operation(first, second, c);
                    System.out.println("result: " + result);

                    stack.add(String.valueOf(result));
                } else {
                    stack.add(String.valueOf(c));
                }
            }
        }
        return Double.parseDouble(stack.peek());
    }

    // assuming there are no divide by zero's for now
    private double operation(double y, double x, char op) {
        switch (op) {
            case '+':
                System.out.println(x + "+" + y);
                return x + y;
            case '-':
                System.out.println(x + "-" + y);
                return x - y;
            case '*':
                System.out.println(x + "*" + y);
                return x * y;
            case '/':
                System.out.println(x + "/" + y);
                return x / y;
            default:
                return -1;
        }
    }
}
