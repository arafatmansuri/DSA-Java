import problems.*;
import structures.Stack;
import structures.StackLinkedList;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();
        System.out.println(vp.WithStack("[(){}[]]"));
    }
}