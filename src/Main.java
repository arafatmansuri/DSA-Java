public class Main {
    public static void main(String[] args) {
        DoublyLinkedList la = new DoublyLinkedList();

        la.add(10);
        la.add(50);
        la.add(30);
//        la.addFirst(20);
        la.addFirst(1);
        la.addAfter(20,50);
        la.addAfter(40,30);
//        la.addAfter(60,50);
        la.addBefore(25,30);
        la.addBefore(0,1);
        la.addBefore(12,1);
        la.deleteFirst();
        la.deleteFirst();
        la.deleteLast();
        la.deleteLast();
//        la.deleteFirst();
        la.delete(50);
//        la.addBefore(25,30);
//        la.addBefore(30,40);
//        la.addBefore(15,20);
//        System.out.println(la);
//        la.deleteLast();
//        System.out.println(la);
//        la.delete(10);
        System.out.println(la);
    }
}