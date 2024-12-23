package SelectionSort;

import java.util.Arrays;

public class SelectionSortCode {
    public static void main(String[] args) {
        int[] arr = {10000, -1, -900000, 45,20, 12000000,900};
        search(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void search(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            int min_Index = i;
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[min_Index]){
                    min_Index = i;
                    break;
                }
            }
            if(min_Index != i){
                int temp = arr[i];
                arr[i] = arr[min_Index];
                arr[min_Index] = temp;
            }
        }

    }
}
