package BasicQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class SwapIndexes {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,5,3};
        Scanner in = new Scanner(System.in);
        swap(arr, 1, 2);
        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] Parr, int FirsTIndex, int secondIndex){
        for(int i = 0; i< Parr.length; i++){
            int temp = Parr[FirsTIndex];
            Parr[FirsTIndex] = Parr[secondIndex];
            Parr[secondIndex] = temp;
        }
    }
}
