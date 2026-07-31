package problems;

import java.util.Arrays;
import structures.Search;

public class TravellingSalesman {
    int[][] arr;
    int rows;
    int cols;

    public TravellingSalesman(int[][] arr, int rows, int cols) {
        this.arr = arr;
        this.rows = rows;
        this.cols = cols;
    }

    public static int[] append(int[] original, int newElement) {
        if (original == null) {
            // If original array is null, create a new one with the element
            return new int[]{newElement};
        }
        // Create a new array with one extra slot
        int[] newArray = Arrays.copyOf(original, original.length + 1);
        // Add the new element at the last position
        newArray[newArray.length - 1] = newElement;
        return newArray;
    }
    public static void iterate(int[] arr){
        for (int n : arr)
            System.out.println(n);
    }

    public void matrixTraversal(int start){
        int[] traversed = {};
        int[] blacklist = {};
        int temp = start - 1;
        while (rows-1 != traversed.length) {
            int indexRow = temp;
            int indexCol = 0;
            int shortest = arr[indexRow][indexCol];
            for (int j = 0; j < cols; j++) {
                if (j == indexRow)
                    continue;
                Search ls = new Search(blacklist);
                if (ls.linearSearch(j)) {
                    continue;
                }
                if (arr[indexRow][j] <= shortest) {
                    shortest = arr[indexRow][j];
                    temp = j;
                }
            }
            blacklist = append(blacklist,indexRow);
            traversed = append(traversed,shortest);
        }
        traversed = append(traversed,arr[temp][start-1]);
        blacklist = append(blacklist,temp);
        System.out.println("Shortest time to travel will be: "+ Arrays.stream(traversed).sum());
        for (int i = 0; i < traversed.length; i++) {
            if (i == traversed.length - 1){
                System.out.print((blacklist[i] + 1)+"->"+(blacklist[0] + 1)+"="+ traversed[i]);
                break;
            }
            System.out.print((blacklist[i] + 1)+"->"+(blacklist[i+1] + 1)+"="+ traversed[i]+",");
        }
    }
}
