import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfOddNumbersTest {

    //        Given the triangle of consecutive odd numbers:
    //
    //        1
    //        3     5
    //        7     9    11
    //        13    15    17    19
    //        21    23    25    27    29
    //...
    //        Calculate the sum of the numbers in the nth row of this triangle (starting at index 1) e.g.: (Input --> Output)
    //
    //        1 -->  1
    //        2 --> 3 + 5 = 8
    //        5 --> 21 + 23 + 25 + 27 + 29 =

    @Test
    @DisplayName("Test 2")
    void firstTest() {
        int i = RowSumOddNumbers(2);
        assertEquals(i, 8);
    }

    @Test
    @DisplayName("Test 5")
    void secondTest() {
        int i = RowSumOddNumbers(5);
        assertEquals(i, 125);
    }

    public int RowSumOddNumbers(int n) {
        int sum = 0;
        int odd = 1;
        for (int row = 1; row <= n; row++) {
            for (int j = 0; j < row; j++) {
                if (row == n){
                    sum += odd;
                }
                odd+=2;
            }
        }
        return sum;
    }
}
