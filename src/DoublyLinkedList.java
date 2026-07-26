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
