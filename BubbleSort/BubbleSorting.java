package BubbleSort;

import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] arr = {-1, -334, 0 , 50000, 100000, 34};
        search(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void search(int[] arr){
        boolean swapped;
        for(int i = 0; i < arr.length; i++){
            swapped = false;
            for(int j = 1; j <= arr.length - 1 -i; j++){
                if(arr[j] <  arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j -1];
                    arr[j -1] = temp;
                    swapped = true;
                }
            }

            if(!swapped){
                break;
            }
        }
    }
}
