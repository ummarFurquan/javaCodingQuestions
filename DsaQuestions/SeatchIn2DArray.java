package DsaQuestions;

import java.util.Arrays;

public class SeatchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {12, 32, 43, 45},
                {23,90, 1},
                {34}
        };

        int target = 1;
        int[] res = search(arr, target);
        System.out.println(Arrays.toString(res));
    }

    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[] {row,col};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
