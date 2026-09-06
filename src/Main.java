import problems.Anagram;
import problems.FindDuplicate;
import problems.TravellingSalesman;
import problems.TwoSum;
import structures.Stack;
import structures.StackLinkedList;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Anagram ts = new Anagram("angara","nagara");
        boolean result = ts.withCountMap();
        if(result)
            System.out.println("It's Anagram");
        else
            System.out.println("It's not an Anagram");
    }
}