package Arrays;

import java.util.Arrays;
//right rotation
public class RotateToRightByDTimes {
    public static void main(String[] args) {

        int[] res =  helperFunction(1);
        System.out.println(Arrays.toString(res));
    }

    static int[] helperFunction(int k){
        int[] arr = {1,2,3,4,5,6,7};
        int n = arr.length;
        k = k % n;
        rotate(arr, 0, n - 1);

        // Reverse the first k elements
        rotate(arr, 0, k - 1);

        // Reverse the remaining n-k elements
        rotate(arr, k, n - 1);

        return arr;
    }
    static void rotate(int[] arr, int start, int end){
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
}
