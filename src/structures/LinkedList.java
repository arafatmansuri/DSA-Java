package structures;

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
    private boolean isEmpty(){
        if (head == null) {
            System.out.println("List is empty!");
            return true;
        }
        return false;
    }
    private boolean isExists(int data){
        Node current = head;
        while (current.next != null){
            if (current.data == data){
                return false;
            }
            current = current.next;
        }
        if (current.data != data){
            System.out.println("Element "+data+ " not found!");
            return true;
        }
        return  false;
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
        if (isExists(element))
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
        if (isExists(element))
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
        if (current.next == null) {
            deleteFirst();
            return;
        }
        while(current.next.next !=null){
            current = current.next;
        }
        current.next = null;
    }
    public void delete(int data){
        if (isEmpty())
            return;
        if (isExists(data))
            return;
        Node current = head;
        if (current.next == null || current.data == data){
            deleteFirst();
            return;
        }
        while(current.next.data !=data){
            current = current.next;
        }
        Node temp = current.next;
        current.next = current.next.next;
        temp = null;
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
