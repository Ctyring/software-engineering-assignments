import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaxSubSumOfSequenceTest {
    @Test
    public void testMaxSubSum() {
        int[] arr1 = {1, -2, 3, 5, -1};
        int expected1 = 8;
        assertEquals(expected1, MaxSubSumOfSequence.maxSubSum(arr1));

        int[] arr2 = {1, -2, 3, -8, 5, 1};
        int expected2 = 6;
        assertEquals(expected2, MaxSubSumOfSequence.maxSubSum(arr2));

        int[] arr3 = {1, -2, 3, -2, 5, 1};
        int expected3 = 7;
        assertEquals(expected3, MaxSubSumOfSequence.maxSubSum(arr3));
    }
}
