package problems;

import java.util.*;

public class GroupAnagram {
    String[] words = {"eat","tea","tan","ate","nat","bat"};
    public String sortString(char[] chars){
        Arrays.sort(chars);
        StringBuilder str = new StringBuilder();
        for (char aChar : chars) {
            str.append(aChar);
        }
        return str.toString();
    }
    public boolean isGrouped(String str,String[] groups){
        for (String s : groups)
            if (s.equals(str))
                return true;
        return false;
    }
    public void printArr(String[][] arr){
        for (String[] s: arr) {
            for (String str : s)
                System.out.print(str);
            System.out.println();
        }
    }
    public ArrayList<ArrayList<String>> bruteForce(){
        ArrayList<ArrayList<String>> groups = new ArrayList<>();
        ArrayList<Integer> groupedIndex = new ArrayList<Integer>();
        int groupIndex = 0;
        for (int i = 0; i < words.length; i++) {
            if (groupedIndex.contains(i)) {
                continue;
            }
            ArrayList<String> list = new ArrayList<String>();
            list.add(words[i]);
            groupedIndex.add(i);
            for (int j = i+1; j < words.length; j++) {
                if (Objects.equals(sortString(words[i].toCharArray()), sortString(words[j].toCharArray()))){
                    list.add(words[j]);
                    groupedIndex.add(j);
                }
            }
            groups.add(list);
            groupIndex++;
        }
        return groups;
    }
    public List<List<String>> WithSignatureMap(String[] strs){
        Map<String,List<String>> signature = new HashMap<>();
        for (String s: strs){
            String currentSignature = sortString(s.toCharArray());
            if (signature.containsKey(currentSignature)){
                List<String> ls = signature.get(currentSignature);
                ls.add(s);
                signature.put(currentSignature,ls);
                continue;
            }
            List<String> list = new ArrayList<>();
            list.add(s);
            signature.put(currentSignature,list);
        }
        return signature.values().stream().toList();
    }
}
