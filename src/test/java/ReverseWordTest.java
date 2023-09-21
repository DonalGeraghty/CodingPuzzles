import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseWordTest {
//    Task
//
//    Given a string str, reverse it and omit all non-alphabetic characters.
//    Example
//
//    For str = "krishan", the output should be "nahsirk".
//
//    For str = "ultr53o?n", the output should be "nortlu".
//    Input/Output
//
//    [input] string str
//
//    A string consists of lowercase latin letters, digits and symbols.
//
//    [output] a string

    @Test
    @DisplayName("Test krishan is nahsirk")
    void firstTest() {
        String word = "krishan";
        assertEquals("nahsirk", reverseLetter(word));
    }

    @Test
    @DisplayName("Test ultr53o?n is nortlu")
    void secondTest() {
        String word = "ultr53o?n";
        assertEquals("nortlu", reverseLetter(word));
    }

    @Test
    @DisplayName("Test donal is lanod")
    void thirdTest() {
        String word = "donal";
        assertEquals("lanod", reverseLetter(word));
    }

    public static String reverseLetter(final String str) {
        char[] arr = str.toCharArray();
        StringBuilder s = new StringBuilder();
        for (char c : arr) {
            boolean b = Character.isAlphabetic(c);
            if (b) {
                s.insert(0, c);
            }
        }
        return s.toString();
    }
}
