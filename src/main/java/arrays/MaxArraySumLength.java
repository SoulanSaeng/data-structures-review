package arrays;

public class MaxArraySumLength {

    public int maxSubArray(int[] nums) {

        int currentMax = nums[0];
        int max = nums[0];
        int currentVal;

        for(int i = 1 ; i<nums.length ; ++i ){
            currentVal = nums[i];
            currentMax = Math.max(currentMax + currentVal, currentVal);
            max = Math.max(currentMax, max);
        }

        return max;
    }
}
