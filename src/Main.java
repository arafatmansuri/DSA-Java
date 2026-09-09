import problems.*;
import structures.Stack;
import structures.StackLinkedList;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ConsecutiveSequence ps = new ConsecutiveSequence();
        System.out.println(Arrays.toString(ps.withSet(new int[]{1,2,3,4})));
    }
}