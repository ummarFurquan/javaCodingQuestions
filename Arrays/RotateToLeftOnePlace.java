package Arrays;

import java.util.Arrays;

public class RotateToLeftOnePlace {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(rotate(arr)));
    }

    static int[] rotate(int[] arr){
        int n = arr.length;
        int temp = arr[0];
        int i;
        for(i = 1; i < n ; i++){
            arr[i - 1] = arr[i];
        }
        arr[i - 1] = temp;
        return arr;
    }
}
