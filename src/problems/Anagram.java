package problems;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    String str;
    String str2;
    public Anagram(String str, String str2) {
        this.str = str;
        this.str2 = str2;
    }

    public boolean withCountMap(){
        if (str.length() != str2.length())
            return false;
        Map<Character,Integer> count = new HashMap<>();
        char[] strCharArray = str.toCharArray();
        for(char c : strCharArray){
            int currentCount = count.getOrDefault(c,0);
            count.put(c,++currentCount);
        }
        char[] str2CharArray = str2.toCharArray();
        for(char c : str2CharArray){
            int currentCount = count.get(c);
            count.put(c,--currentCount);
            if (currentCount < 0)
                return  false;
        }
        return true;
    }
}
