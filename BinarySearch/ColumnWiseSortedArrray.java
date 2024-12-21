package BinarySearch;

import java.util.Arrays;

public class ColumnWiseSortedArrray {
    public static void main(String[] args) {
        int[][] arr = {
                {10,1,3,90},
                {20,4,20,115},
                {30,10,25,160},
                {40,50,30,200}
        };

        int target = 30;


        int[] res = search(arr,target);
        System.out.println(Arrays.toString(res));


    }
    static int[] search(int[][] arr, int target){
        int row = arr.length-1;
        int col = 0;

        while(row < arr.length && col >= 0){
            if(target == arr[row][col]){
                return new int[] {row,col};
            } else if (target < arr[row][col]) {
                col++;
            }else {
                row--;
            }
        }
        return new int[] {-1,-1};
    }
}
