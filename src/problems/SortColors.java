package problems;

import java.util.Arrays;

public class SortColors {
    public int[] bruteForce(int[] nums){
        int[] count = {0,0,0};
        for (int n: nums)
            count[n]++;
        int countIndex = 0;
        for (int i = 0;i< nums.length;i++) {
            if (count[countIndex] == 0)
                countIndex++;
            nums[i] = countIndex;
            count[countIndex]--;
        }
        return nums;
    }
    public int[] withDutchFlag(int[] nums){
        int low = 0,mid =0,high = nums.length -1;
        while (mid<=high){
            if (nums[mid] == 0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;mid++;
            }
            else if (nums[mid] == 1) mid++;
            else{
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
        return nums;
    }
}
