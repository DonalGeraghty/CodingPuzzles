import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberFunTest {

    //    You might know some pretty large perfect squares. But what about the NEXT one?
    //
    //    Complete the findNextSquare method that finds the next integral perfect square after the one passed as a parameter. Recall that an integral perfect square is an integer n such that sqrt(n) is also an integer.
    //
    //    If the parameter is itself not a perfect square then -1 should be returned. You may assume the parameter is non-negative.
    //
    //            Examples:(Input --> Output)
    //
    //            121 --> 144
    //            625 --> 676
    //            114 --> -1 since 114 is not a perfect square

    @Test
    @DisplayName("Test 121")
    void firstTest() {
        long i = findNextSquare(121);
        assertEquals(i, 144);
    }

    @Test
    @DisplayName("Test 625")
    void secondTest() {
        long i = findNextSquare(625);
        assertEquals(i, 676);
    }

    @Test
    @DisplayName("Test 114")
    void thirdTest() {
        long i = findNextSquare(114);
        assertEquals(i, -1);
    }

    public long findNextSquare(long sq) {
        double root = Math.sqrt(sq);
        if (Math.sqrt(sq) % 1 == 0.0) {
            long num = (long) (root + 1);
            return num * num;
        } else {
            return -1;
        }
    }
}
