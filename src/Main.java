import problems.*;
import structures.Stack;
import structures.StackLinkedList;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TopKFrequent fr = new TopKFrequent();
        fr.bruteForce(new int[]{1,1,1,5,2,2,2,2,3,3,3,3,3},2);
    }
}