//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] numbers = {5,30,12,10,1,44,11,50,2,3};
        int[] arr = {3,5,1,4,6,2};

        Sort s = new Sort(numbers);

        s.mergeSort(arr,0,arr.length-1);
        for (int n : arr){
            System.out.println(n);
        }
    }
}