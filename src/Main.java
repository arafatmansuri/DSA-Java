public class Main {
    public static void main(String[] args) {
        DoublyLinkedList la = new DoublyLinkedList();

        la.add(10);
        la.add(50);
        la.add(30);
        System.out.println(la);
//        la.addFirst(20);
        la.addFirst(1);
        System.out.println(la);
        la.addAfter(20,50);
        System.out.println(la);
        la.addAfter(40,30);
        System.out.println(la);
//        la.addAfter(60,50);
        la.addBefore(25,30);
        la.addBefore(0,1);
        System.out.println(la);
        la.addBefore(12,1);
        System.out.println(la);
        la.deleteFirst();
        la.deleteFirst();
        System.out.println(la);
        la.deleteLast();
        la.deleteLast();
        System.out.println(la);
//        la.deleteFirst();
        la.delete(50);
        System.out.println(la);
//        la.addBefore(25,30);
//        la.addBefore(30,40);
//        la.addBefore(15,20);
//        System.out.println(la);
//        la.deleteLast();
//        System.out.println(la);
        la.delete(10);
        System.out.println(la);
    }
}