package problems;

import java.util.*;

public class MoveZeros {
    public void bruteForce(int[] nums){
        int size = nums.length;
        List<Integer> list = new ArrayList<Integer>();
        for (int n=0;n<size;n++)
            if (nums[n] == 0) list.add(n);
        if (list.isEmpty()) return;
        int listSize = list.size();
        for (int i = size - listSize; i < size; i++) {
            int temp = list.get(0);
            nums[temp] = nums[i];
            nums[i] = 0;
            list.remove(0);
        }
    }
    public void withTwoPointer(int[] nums){
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != 0){
                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;
                slow++;
            }
        }
    }
}
