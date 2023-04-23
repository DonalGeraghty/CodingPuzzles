import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListFilteringTest {

    //    In this kata you will create a function that takes a list of non-negative integers and strings and returns a new list with the strings filtered out.
    //
    //    Example
    //        Kata.filterList(List.of(1, 2, "a", "b")) => List.of(1,2)
    //        Kata.filterList(List.of(1, 2, "a", "b", 0, 15)) => List.of(1,2,0,15)
    //        Kata.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 231)) => List.of(1, 2, 231)

    @Test
    @DisplayName("Test List.of(1, 2, \"a\", \"b\")")
    void firstTest() {
        List<Object> list = filterList(List.of(1, 2, "a", "b"));
        assertEquals(list, List.of(1,2));
    }

    @Test
    @DisplayName("Test List.of(1, 2, \"a\", \"b\", 0, 15)")
    void secondTest() {
        List<Object> list = filterList(List.of(1, 2, "a", "b", 0, 15));
        assertEquals(list, List.of(1,2,0,15));
    }

    @Test
    @DisplayName("Test List.of(1, 2, \"a\", \"b\", \"aasf\", \"1\", \"123\", 231)")
    void thirdTest() {
        List<Object> list = filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 231));
        assertEquals(list, List.of(1, 2, 231));
    }

    public static List<Object> filterList(final List<Object> list) {
        List<Object> integers = new ArrayList<>();
        for (Object obj : list) {
            if (obj instanceof Integer) {
                integers.add(obj);
            }
        }
        return integers;
    }
}
