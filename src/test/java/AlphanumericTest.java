import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AlphanumericTest {

    @Test
    @DisplayName("Test abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789")
    public void firstTest() {
        String s = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        assertTrue(isAlphanumeric(s));
    }

    @Test
    @DisplayName("Test empty")
    public void secondTest() {
        String s = "";
        assertFalse(isAlphanumeric(s));
    }

    @Test
    @DisplayName("Test with space")
    public void thirdTest() {
        String s = "with space";
        assertFalse(isAlphanumeric(s));
    }

    @Test
    @DisplayName("Test with emojii")
    public void fourthTest() {
        String s = "emoji😊";
        assertFalse(isAlphanumeric(s));
    }

    private boolean isAlphanumeric(String s) {
        char[] chars = s.toCharArray();
        if (chars.length == 0 ){
            return false;
        }
        for (char aChar : chars) {
            // from ASCII table, https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html
            int i = (int) aChar;
            if (i <= 47 || i >= 123) {
                return false;
            } else if (i >= 58 && i <= 64) {
                return false;
            } else if (i >= 91 && i <= 96) {
                return false;
            }
        }
        return true;
    }
}
