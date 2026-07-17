//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        Search ls = new Search(numbers);
        System.out.println(ls.linearSearch(1));
        SearchResult sr = ls.binarySearch(44);
        System.out.println("Binary Search result index: "+sr.index);
        int rbs = ls.recursiveBinarySearch(10,0,numbers.length-1);
        System.out.println("Recursive Binary Search result index: "+rbs);
    }
}