import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class AnagramDetectionTest {

    //    An anagram is the result of rearranging the letters of a word to produce a new word (see wikipedia).
    //
    //    Note: anagrams are case insensitive
    //
    //    Complete the function to return true if the two arguments given are anagrams of each other; return false otherwise.
    //            Examples
    //
    //    "foefet" is an anagram of "toffee"
    //
    //            "Buckethead" is an anagram of "DeathCubeK"

    @Test
    @DisplayName("Test: foefet - toffee")
    void firstTest() {
        assertTrue(isAnagram("foefet", "toffee"));
    }

    @Test
    @DisplayName("Test: Buckethead - DeathCubeK")
    void secondTest() {
        assertTrue(isAnagram("Buckethead", "DeathCubeK"));
    }

    @Test
    @DisplayName("Test: Twoo - Woot")
    void thirdTest() {
        assertTrue(isAnagram("Twoo", "Woot"));
    }

    @Test
    @DisplayName("Test: apple - pale")
    void fourthTest() {
        assertFalse(isAnagram("apple", "pale"));
    }


    public boolean isAnagram(String test, String original) {
        char ch1 [] = test.toLowerCase().toCharArray();
        char ch2 [] = original.toLowerCase().toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);
    }
}
