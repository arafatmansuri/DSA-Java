package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class MinStack {
    private Node head;
    public void push(int value) {
        if (head == null)
            head = new Node(value,value,null);
        else
            head = new Node(value,Math.min(value,head.min),head);
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.value;
    }

    public int getMin() {
        return head.min;
    }
    private static class Node{
        int value;
        Node next;
        int min;
        private Node(int top,int min,Node next){
            this.value = top;
            this.min = min;
            this.next = next;
        }
    }
}
