package problems;

import java.util.*;

public class ThreeSum {
//    Find all unique triplets that sum to zero
//    Given an integer array, find all unique triplets that sum to zero, with no duplicate triplets in the result.
//    [-1,0,1,2,-1,-4]
    public List<List<Integer>> bruteForce(int[] nums){
        Map<Integer,List<Integer>> map = new HashMap<>();
        Map<Integer,List<Integer>> sortedMap = new HashMap<>();
        int mapIndex = 0;
        for (int i = 0; i < nums.length - 2 ; i++) {
            for (int j = i+1; j < nums.length - 1; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    List<Integer> ls = new ArrayList<>();
                    ls.add(nums[i]);
                    ls.add(nums[j]);ls.add(nums[k]);
                    if (nums[i] + nums[j]+ nums[k] == 0) {
                        List<Integer> sortedList = ls.stream().sorted().toList();
                        if (sortedMap.containsValue(sortedList))
                            continue;
                        sortedMap.put(mapIndex++,sortedList);
                        map.put(mapIndex++, ls);
                    }
                }
            }
        }
        return map.values().stream().toList();
    }
    public List<List<Integer>> WithSortAndTwoPointer(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                } else if (sum < 0) left++; // Sum too small -> increase left
                else right--; // Sum too large -> decrease right
            }
        }
        return result;
    }
}
