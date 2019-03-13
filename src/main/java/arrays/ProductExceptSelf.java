package arrays;

public class ProductExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int [] result = new int[length];

        //Initialize the accumulator that will hold the product of the entire array up until N.
        //Start from 0, up until n-1.
        int startProduct = 1;
        for(int i = 0; i < length ; i++){
            result[i] = startProduct;
            startProduct *= nums[i];
        }

        //Endproduct holds the product of all elements starting from n-1.
        // Endproduct is obtained by end-product * element[n - 1].
        int endProduct = 1;
        for(int j = length - 1 ; j >= 0 ; j--){
            result[j] *= endProduct;
            endProduct *= nums[j];
        }

        return result;
    }
}
