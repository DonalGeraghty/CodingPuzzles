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
        String testString = "{()()}";
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

    @Test
    @DisplayName("Test null")
    void sixthTest() {
        String testString = null;
        assertEquals(isValid(testString), "invalid");
    }

    @Test
    @DisplayName("Test empty")
    void seventhTest() {
        String testString = "";
        assertEquals(isValid(testString), "invalid");
    }

    final char openCurly = '{';
    final char closedCurly = '}';
    final char openRound = '(';
    final char closedRound = ')';
    final String valid = "valid";
    final String invalid = "invalid";

    public String isValid(String s) {

        if (s == null || s.isEmpty()) {
            return invalid;
        } else {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char currentChar = s.charAt(i);

                switch (currentChar){
                    case openCurly:
                        stack.add(currentChar);
                        break;
                    case openRound:
                        stack.add(currentChar);
                        break;
                    case closedCurly:
                        return handleClosedBracket(stack, openCurly);
                    case closedRound:
                        return handleClosedBracket(stack, openRound);
                    default:
                        return invalid;
                
                }
            }
            return stack.size() == 0 ? valid : invalid;
        }

    }

    private String handleClosedBracket(Stack<Character> stack, char c) {
        if (stack.isEmpty()) { // if the first is closed, invalid
            return invalid;
        } else if (stack.peek() == c) { // if the previous makes the pair, remove both
            stack.pop();
            return valid;
        } else {
            return invalid; // if the previous does not make the pair, invalid
        }
    }
}
