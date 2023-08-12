import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WhoLikesItTest {

    @Test
    @DisplayName("no one likes this")
    public void firstTest() {
        assertEquals("no one likes this", whoLikesIt());
    }

    @Test
    @DisplayName("Peter likes this")
    public void secondTest() {
        assertEquals("Peter likes this", whoLikesIt("Peter"));
    }

    @Test
    @DisplayName("Jacob and Alex like this")
    public void thirdTest() {
        assertEquals("Jacob and Alex like this", whoLikesIt("Jacob", "Alex"));
    }

    @Test
    @DisplayName("Max, John and Mark like this")
    public void fourthTest() {
        assertEquals("Max, John and Mark like this", whoLikesIt("Max", "John", "Mark"));
    }

    @Test
    @DisplayName("Alex, Jacob and 2 others like this")
    public void fifthTest() {
        assertEquals("Alex, Jacob and 2 others like this", whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }

    @Test
    @DisplayName("Alex, Jacob and 3 others like this")
    public void sixthTest() {
        assertEquals("Alex, Jacob and 3 others like this", whoLikesIt("Alex", "Jacob", "Mark", "Max", "Donal"));
    }


    public String whoLikesIt(String... names) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, names);
        int numberOfNames = names.length;
        if (numberOfNames == 0){
            return "no one likes this";
        } else if (numberOfNames == 1) {
            return list.get(0) + " likes this";
        } else if (numberOfNames == 2) {
            return list.get(0) + " and " + list.get(1) + " like this";
        } else if (numberOfNames == 3) {
            return list.get(0) + ", " + list.get(1) + " and " + list.get(2) + " like this";
        } else {
            return list.get(0) + ", " + list.get(1) + " and " + (list.size() - 2) + " others like this";
        }
    }
}
