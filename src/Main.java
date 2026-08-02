import problems.TravellingSalesman;
import structures.Stack;
import structures.StackLinkedList;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static int[] append(int[] original, int newElement) {
        if (original == null) {
            // If original array is null, create a new one with the element
            return new int[]{newElement};
        }
        // Create a new array with one extra slot
        int[] newArray = Arrays.copyOf(original, original.length + 1);
        // Add the new element at the last position
        newArray[newArray.length - 1] = newElement;
        return newArray;
    }
    public static void main(String[] args) {
        StackLinkedList s = new StackLinkedList();

        s.push(10);
        s.push(20);
        //        s.push(15);
//        s.push(40);
//        s.push(50);
        System.out.println(s);
        s.pop();
        s.pop();
        s.pop();
//        s.push(15);
//        s.push(22);
        System.out.println(s);
    }
}