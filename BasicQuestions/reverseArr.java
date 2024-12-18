package BasicQuestions;

import java.util.Arrays;
        
public class reverseArr {

    static  int[] reverse(int[] arr){
        int len = arr.length;

        for(int i = 0; i < len/2; i++){
            int temp = arr[i];
            arr[i] = arr[len - i - 1];
            arr[len - i -1] = temp;

        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = {1,3,2,4,5,6,9  };
        int[] res = reverse(arr);
        System.out.print(Arrays.toString(res));
    }
}
