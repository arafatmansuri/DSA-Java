package problems;

import java.util.HashMap;
import java.util.Map;

public class ProductOfPrefixSuffix {
    public int[] bruteForce(int[] nums){
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = 1;
            for (int j = 0; j < nums.length; j++) {
                if (j == i)
                    continue;
                result[i] *= nums[j];
            }
        }
        return result;
    }
    public int[] productExceptSelf(int[] nums){
        int[] result = new int[nums.length];
        int prefix = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = prefix;
            prefix = prefix * nums[i];
        }
        int suffix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] = result[i] * suffix;
            suffix = suffix * nums[i];
        }
        return result;
    }
}
