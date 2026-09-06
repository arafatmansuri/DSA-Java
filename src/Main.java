import problems.TravellingSalesman;
import problems.TwoSum;
import structures.Stack;
import structures.StackLinkedList;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] result = ts.twoPointer(52);
        if(result != null)
            System.out.println("Indices are: "+result[0]+","+result[1]);
        else
            System.out.println("No match found for target");
    }
}