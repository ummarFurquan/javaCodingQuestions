package BinarySearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RowWIseSortedArray {
    public static void main(String[] args) {
        int[][] arr =  {
        // ---> row
        {10, 20, 30, 40},  // col⬇️
        {1, 4, 10, 15},
        {34, 44, 60, 65},
        {20, 29, 37, 49},
        };
        int target = 60;
        int[] res = search(arr, target);
        System.out.println(Arrays.toString(res));
    }

    static int[] search(int[][] arr, int target){
        int row = 0;
        int col = arr.length -1;

        while(row < arr.length && col >= 0){
            if(arr[row][col] == target){
                return new int[] {row,col};
            } else if (target > arr[row][col]) {
                row++;
            } else{
                col--;
            }
        }
        return new int[] {-1, -1};
    }
}
