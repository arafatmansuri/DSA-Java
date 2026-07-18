public class Sort {
    int[] numbers;
    int size;
    public Sort(int[] numbers) {
        this.numbers = numbers;
        this.size = numbers.length;
    }
    // [5,1,2,10,4,3]
    public int[] bubbleSort(){
        int[] swapped = numbers;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                int temp;
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
        int minIndex = 0;
        int temp = 0;
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
}
