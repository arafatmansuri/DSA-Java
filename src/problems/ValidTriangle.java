package problems;

import java.util.Arrays;

public class ValidTriangle{
    public int withPointer(int[] nums){
        Arrays.sort(nums);
        int count = 0;
        for (int  k = nums.length-1; k > 1; k--) {
            int left = 0,right = k-1;
            while (left<right){
                if (nums[left] + nums[right] > nums[k]){
                    count+=(right-left);
                    right--;
                }
                else left++;
            }
        }
        return count;
    }
}
