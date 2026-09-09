package problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ConsecutiveSequence {
    public int withSet(Integer[] nums){
        Set<Integer> set =Arrays.stream(nums).collect(Collectors.toSet());
        int best = 0;
        for (int n : set){
            if(set.contains(n-1)) continue;
            int len = 1;
            while (set.contains(n+len)){
                len++;
            }
            best = Math.max(len, best);
        }
        return best;
    }
}
