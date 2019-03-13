package arrays;

import org.junit.Assert;
import org.junit.Test;

public class MaxSubArraySum {

    @Test
    public void maxArraySub(){
        int [] a = {-2,1,-3,4,-1,2,1,-5,4};
        MaxArraySumLength masl = new MaxArraySumLength();
        Assert.assertEquals(masl.maxSubArray(a), 6);
    }
}
