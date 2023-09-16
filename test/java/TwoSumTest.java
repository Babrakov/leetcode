import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {

    @Test
    public void testTwoSum(){
        TwoSum twoSum = new TwoSum();

        int[] nums = {2,7,11,15};
        int target = 9;

        int[] expected = {0,1};

        int[] result = twoSum.twoSum(nums,target);

        assertArrayEquals(expected,result);
    }




}
