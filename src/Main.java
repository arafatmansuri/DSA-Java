import problems.*;
import structures.Stack;
import structures.StackLinkedList;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ThreeSum ts = new ThreeSum();
        System.out.println(ts.WithSortAndTwoPointer(new int[]{-1,0,1,2,-1,-4}));
//        ts.bruteForce(new int[]{0,1,1});
    }
}