package structures;

import java.util.*;

public class Stack {
    private final int[] arr = new int[5];
    int top;
    int size;
    public Stack(){
        size = arr.length;
        top = -1;
    }
    public void push(int data){
        if (top<size) {
            arr[++top] = data;
        }else
            System.out.println("Stack overflow couldn't add "+ data);
    }
    public int pop(){
        if (top>-1)
            return arr[top--];
        else
            System.out.println("Stack Underflow");
        return 0;
    }
    public int peek(){
        return arr[top];
    }
    public String toString(){
        List<Integer> list = new ArrayList<>();
        for (int i= top; i>=0; i--)
            list.add(arr[i]);
        return list.toString();
    }
}
