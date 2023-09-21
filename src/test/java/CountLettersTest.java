import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountLettersTest {


    @Test
    @DisplayName("Test DONALGERAGHTY")
    void firstTest(){
        int num = CountOccurrencesOfLetter("DONALGERAGHTY", 'D');
        assertEquals(num, 2);
    }


    @Test
    @DisplayName("Test AANBMDKKKSA")
    void secondTest(){
        int num = CountOccurrencesOfLetter("AANBMDKKKSA", 'A');
        assertEquals(num, 3);
    }

    public Integer CountOccurrencesOfLetter(String str, Character character){
        char[] charArray = str.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        for (char c : charArray) {
            list.add(c);
        }
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char c:list) {
            hashMap.putIfAbsent(c, Collections.frequency(list, c));
        }
        return hashMap.get(character);
    }
}
