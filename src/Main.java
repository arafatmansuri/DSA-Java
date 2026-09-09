import problems.*;
import structures.Stack;
import structures.StackLinkedList;

import java.util.*;

public class Main {
    public static String sortString(char[] chars){
        Arrays.sort(chars);
        StringBuilder str = new StringBuilder();
        for (char aChar : chars) {
            str.append(aChar);
        }
        return str.toString();
    }
    public static void main(String[] args) {
        GroupAnagram ga = new GroupAnagram();
//        System.out.println(ga.bruteForce());
        ga.WithSignatureMap(new String[]{"eat","tea","tan","ate","nat","bat"});

    }
}