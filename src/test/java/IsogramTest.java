import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class IsogramTest {

    @Test
    @DisplayName("Test Dermatoglyphics")
    void firstTest(){
        String s = "Dermatoglyphics";
        assertTrue(isIsogram(s));
    }

    @Test
    @DisplayName("Test moose")
    void secondTest(){
        String s = "moose";
        assertFalse(isIsogram(s));
    }
    @Test
    @DisplayName("Test aba")
    void thirdTest(){
        String s = "aba";
        assertFalse(isIsogram(s));
    }

    public boolean isIsogram(String str){
        char[] charArray = str.toLowerCase().toCharArray();
        Arrays.sort(charArray);
        if (charArray.length != 0){
            for (int i = 0; i < charArray.length - 1; i++) {
                boolean isEqual = charArray[i] == charArray[i+1];
                if (isEqual){
                    return false;
                }
            }
        }
        return true;
    }
}
