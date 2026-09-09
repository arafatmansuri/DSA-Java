import problems.*;
import structures.Stack;
import structures.StackLinkedList;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ProductOfPrefixSuffix ps = new ProductOfPrefixSuffix();
        System.out.println(Arrays.toString(ps.productExceptSelf(new int[]{1,2,3,4})));
    }
}