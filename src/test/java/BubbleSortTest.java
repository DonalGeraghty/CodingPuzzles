import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {

    @Test
    @DisplayName("Testing SORT")
    public void sortTest() {
        int[] unsorted = {2, 7, 3, 6, 5, 4, 0, 8, 1, 9};
        printArray(unsorted);
        int[] sorted = bubbleSortArray(unsorted);
        printArray(sorted);
    }

    private int[] bubbleSortArray(int[] arr) {
        int i, j, x;
        boolean b;
        for (i = 0; i < arr.length - 1; i++) {
            b = false;
            for (j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    x = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = x;
                    b = true;
                }
            }
            if (!b) {
                break;
            }
        }
        return arr;
    }

    private void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j);
        }
        System.out.println();
    }
}
