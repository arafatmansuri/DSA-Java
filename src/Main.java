import problems.*;
import structures.Stack;
import structures.StackLinkedList;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ReversePolishNotation rpn = new ReversePolishNotation();
//        System.out.println(rpn.withStack(new String[]{"4","13","5","/","+"}));
        System.out.println(rpn.withStack(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }
}