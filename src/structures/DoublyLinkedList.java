package structures;

import java.util.ArrayList;
import java.util.List;

class DNode {
    int data;
    DNode prev;
    DNode next;

    public DNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
public class DoublyLinkedList {
    DNode head = null;
    DNode newNode;
    private boolean isEmpty(){
        if (head == null) {
            System.out.println("List is empty!");
            return true;
        }
        return false;
    }
    private boolean isExists(int data){
        DNode current = head;
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
        newNode = new DNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        DNode current = head;
        while (current.next !=null)
            current = current.next;
        newNode.prev = current;
        current.next = newNode;
    }
    public void addFirst(int data){
        newNode = new DNode(data);
        DNode current = head;
        if (current != null) {
            current.prev = newNode;
            newNode.next = current;
        }
        head = newNode;
    }
    public void addAfter(int data,int element){
        if (isEmpty())
            return;
        if (isExists(element))
            return;
        newNode = new DNode(data);
        DNode current = head;
        while(current.data != element)
            current = current.next;
        newNode.next = current.next;
        newNode.prev = current;
        if(current.next != null)
            current.next.prev = newNode;
        current.next = newNode;
    }
    public void addBefore(int data,int element){
        if (isEmpty())
            return;
        if (isExists(element))
            return;
        newNode = new DNode(data);
        DNode current = head;
        while(current.data != element)
            current = current.next;
        newNode.prev = current.prev;
        newNode.next = current;
        if (current.prev != null)
            current.prev.next = newNode;
        else
            head = newNode;
        current.prev = newNode;
    }
    public void deleteFirst(){
        if (isEmpty())
            return;
        DNode current = head;
        if (current.next != null) {
            current.next.prev = null;
            head = current.next;
        }else
            head = null;
        current = null;
    }
    public void deleteLast(){
        if (isEmpty())
            return;
        DNode current = head;
        while (current.next != null)
            current = current.next;
        if (current.prev != null)
            current.prev.next = null;
        else
            head = null;
        current = null;
    }
    public void delete(int data){
        DNode current = head;
        if (current.data == data) {
            deleteFirst();
            return;
        }
        while (current.data != data)
            current = current.next;
        current.prev.next = current.next;
        current.next.prev = current.prev;
        current = null;
    }
    @Override
    public String toString(){
        if (head == null)
            return "List is empty";
        DNode current = head;
        List<Integer> list = new ArrayList<>();
        while(current.next != null){
            list.add(current.data);
            current = current.next;
        }
        list.add(current.data);
        return list.toString();
    }
}
