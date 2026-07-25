public class Main {
    public static void main(String[] args) {
        LinkedList la = new LinkedList();

        la.add(10);
        la.add(50);
        la.addFirst(20);
        la.addFirst(1);
        la.addAfter(30,20);
        la.addAfter(40,30);
        la.addAfter(60,50);
        la.addBefore(25,30);
        la.addBefore(0,1);
        System.out.println(la);
    }
}