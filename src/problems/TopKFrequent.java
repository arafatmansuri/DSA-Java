package problems;

import java.util.*;

public class TopKFrequent {
    public int[] bruteForce(int[] nums, int k){
        Map<Integer,Integer> map = new HashMap<>();
        for (int n: nums){
            Integer isExists = map.getOrDefault(n,0);
            map.put(n,++isExists);
        }
        List<Integer> list = new ArrayList<>();
        while (list.size() != k){
            int max = 0;
            int maxNumber = 0;
            for (Map.Entry<Integer,Integer> e: map.entrySet()){
                if (list.contains(e.getKey())) continue;
                int currMax = Math.max(max,e.getValue());
                if (max != currMax){
                    maxNumber = e.getKey();
                    max = currMax;
                }
            }
            list.add(maxNumber);
        }
        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
