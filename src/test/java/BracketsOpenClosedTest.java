import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BracketsOpenClosedTest {

    @Test
    @DisplayName("Test {}()")
    void firstTest() {
        String testString = "{}()";
        assertEquals(isValid(testString), "valid");
    }

    @Test
    @DisplayName("Test {()()}")
    void secondTest() {
        String testString = "{}()";
        assertEquals(isValid(testString), "valid");
    }

    @Test
    @DisplayName("Test }")
    void thirdTest() {
        String testString = "}";
        assertEquals(isValid(testString), "invalid");
    }


    @Test
    @DisplayName("Test {(})")
    void fourthTest() {
        String testString = "{(})";
        assertEquals(isValid(testString), "invalid");
    }

    @Test
    @DisplayName("Test {)(}")
    void fifthTest() {
        String testString = "{)(}";
        assertEquals(isValid(testString), "invalid");
    }

    public String isValid(String s) {

        final char openCurly = '{';
        final char closedCurly = '}';
        final char openRound = '(';
        final char closedRound = ')';

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            switch (currentChar) {
                case openCurly, openRound -> stack.add(currentChar);
                case closedCurly -> {
                    if (stack.isEmpty()) { // if the first is closed, invalid
                        return "invalid";
                    } else if (stack.peek() == openCurly) { // if the previous makes the pair, remove both
                        stack.pop();
                    } else {
                        return "invalid"; // if the previous does not make the pair, invalid
                    }
                }
                case closedRound -> {
                    if (stack.isEmpty()) {
                        return "invalid";
                    } else if (stack.peek() == openRound) {
                        stack.pop();
                    } else {
                        return "invalid";
                    }
                }
            }
        }
        if (stack.size() == 0) {
            return "valid";
        } else {
            return "invalid";
        }
    }
}
