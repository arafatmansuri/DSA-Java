package problems;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {
    int[] arr = {3,1,3,10,5};
    public boolean bruteForce(){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    return true;
            }
        }
        return false;
    }
    public boolean withSet(){
        Set<Integer> s = new HashSet<>();
        for (int j : arr) {
            if (s.contains(j))
                return true;
            s.add(j);
        }
        return false;
    }
}
