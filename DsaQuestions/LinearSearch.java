package DsaQuestions;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] OrArr = {3,34,23,23,24,154,5,63,41,4};
        int tagrget = 1543;

        boolean res = search(OrArr, tagrget);

        System.out.println(res);

    }

    static boolean search(int[]arr, int n){
        if(arr.length == 0){
            return false;
        }

        for(int index = 0; index < arr.length; index++){
            if(arr[index] == n ){
                return true;
            }
        }
        return false;
    }

    public static class SeatchIn2DArray {
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
}
