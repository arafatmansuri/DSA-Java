package problems;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    int[] arr = {10,20,5,2,1,50};
    public int[] bruteForce(int target){
        int[] indices = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
               if (arr[i] + arr[j] == target) {
                   indices[0] = i;
                   indices[1] = j;
                   return indices;
               }
            }
        }
        return null;
    }
    public int[] twoPointer(int target){
        int i = 0;
        int j = arr.length-1;
        Map<Integer,Integer> seen = new HashMap<Integer,Integer>();
        for (int k = 0; k < arr.length; k++) {
            int need = target - arr[k];
            if (seen.containsKey(need))
                return new int[]{seen.get(need), k};
            seen.put(arr[k],k);
        }
        return null;
    }
}
