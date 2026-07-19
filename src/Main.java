//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] numbers = {5,30,12,10,1,44,11,50,2,3};

        Sort s = new Sort(numbers);

        int[] sw = s.bubbleSort();
        for (int n : sw)
            System.out.print(n+",");
        int[] ss = s.selectionSort();
        System.out.println();
        for (int n : ss)
            System.out.print(n+",");
        int[] is = s.insertionSort();
        System.out.println();
        for (int n : is)
            System.out.print(n+",");
    }
}