public class Sort {
    int[] numbers;
    int size;
    int temp = 0;
    int minIndex = 0;
    public Sort(int[] numbers) {
        this.numbers = numbers;
        this.size = numbers.length;
    }
    // [5,1,2,10,4,3]
    public int[] bubbleSort(){
        int[] swapped = numbers;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (swapped[j] > swapped[j+1]) {
                    temp = swapped[j];
                    swapped[j] = swapped[j+1];
                    swapped[j+1] = temp;
                }
            }
        }
        return swapped;
    }
    public int[] selectionSort(){
        int[] swapped = numbers;
        for (int i = 0; i < size-1; i++) {
            minIndex = i;
            for (int j = i+1; j < size; j++) {
                if (swapped[minIndex] > swapped[j]){
                    minIndex = j;
                }
            }
            temp = swapped[minIndex];
            swapped[minIndex] = swapped[i];
            swapped[i] = temp;
        }
        return swapped;
    }
    public int[] insertionSort(){
        int[] swapped = numbers;
        for (int i = 1; i < size; i++) {
            int key = swapped[i];
            int j = i-1;
            while (j>=0 && swapped[j] > key){
                swapped[j+1] = swapped[j];
                j--;
            }
            swapped[j+1] = key;
        }
        return swapped;
    }
}
