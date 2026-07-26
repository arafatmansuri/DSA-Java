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
    public boolean isEmpty(){
        if (head == null) {
            System.out.println("List is empty");
            return true;
        }
        return false;
    }
    public boolean isExists(int data,Node current){
        if (current.data == data) {
            System.out.println("List is empty");
            return true;
        }
        return false;
    }
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
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head != null)
            newNode.next = head;
        head = newNode;
    }
    public void addAfter(int data,int element){
        if (isEmpty())
            return;
        Node newNode = new Node(data);
        Node current = head;
        while(current.data != element){
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }
    public void addBefore(int data,int element){
        if (isEmpty())
            return;
        Node newNode = new Node(data);
        Node current = head;
        if(current.data == element) {
            addFirst(data);
            return;
        }
        while(current.next.data != element){
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }
    public void deleteFirst(){
        if (isEmpty())
            return;
        Node current = head;
        head = current.next;
        current = null;
    }
    public void deleteLast(){
        if (isEmpty())
            return;
        Node current = head;
        while(current.next.next !=null){
            current = current.next;
        }
        current.next = null;
    }
    public void delete(int data){
        if (isEmpty())
            return;
        Node current = head;
        while(current.next.data !=data){
            current = current.next;
        }
        Node temp = current.next;
        current.next = current.next.next;
        temp = null;
    }
    public void display(){
        if (isEmpty())
            return;
        Node current = head;
        while(current.next != null){
            System.out.print(current.data + ", ");
            current = current.next;
        }
        System.out.println(current.data);
    }
    public String toString(){
        if (head == null)
            return "List is empty";
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
