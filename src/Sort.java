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
}
