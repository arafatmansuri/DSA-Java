import java.util.ArrayList;
import java.util.List;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class LinkedList {
    Node head = null;
    public void add(int data){
        Node newNode = new Node(data);
        Node current = head;
        if(head == null)
            head = newNode;
        else {
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void display(){
        Node current = head;
        while(current.next != null){
            System.out.print(current.data + ", ");
            current = current.next;
        }
        System.out.println(current.data);
    }
    public String toString(){
        Node current = head;
        List<Integer> list = new ArrayList<>();
        while(current.next != null){
            list.add(current.data);
            current = current.next;
        }
        list.add(current.data);
        return list.toString();
    }
}
