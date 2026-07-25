import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedListActions la = new LinkedListActions();

        la.add(10);
        la.add(50);
        System.out.println(la.display());
    }
}