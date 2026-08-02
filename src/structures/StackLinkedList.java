package structures;

import java.util.ArrayList;
import java.util.List;

class StackNode{
    int data;
    StackNode next;

    public StackNode(int data){
        this.data = data;
        next = null;
    }
}

public class StackLinkedList {
    StackNode top;
    public  StackLinkedList(){
        top = null;
    }
    public boolean isEmpty(){
        return top == null;
    }
    public void push(int data){
        if (isEmpty()){
            top = new StackNode(data);
        }
        else{
            StackNode newStack = new StackNode(data);
            newStack.next = top;
            top = newStack;
        }
    }
    public void pop(){
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return;
        }
        StackNode current = top;
        top = top.next;
        System.out.println("Popped "+ current.data);
        current = null;
    }
    public void peek(){
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return;
        }
        System.out.println("Peek is: "+ top.data);
    }
    public String toString(){
        if (isEmpty())
            return "Stack underflow";
        List<Integer> list = new ArrayList<>();
        StackNode current = top;
        while (current.next != null) {
            list.add(current.data);
            current = current.next;
        }
        list.add(current.data);
        return list.toString();
    }
}
