import problems.TravellingSalesman;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] arr = {
                {0,12,11,10,14},
                {12,0,6,7,15},
                {11,6,0,7,18},
                {10,7,7,0,5},
                {14,15,18,5,0}
        };
        TravellingSalesman ts = new TravellingSalesman(arr,arr.length,arr[0].length);
        ts.matrixTraversal(3);
    }
}