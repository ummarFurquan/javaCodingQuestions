package BasicQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class sorting {
    public static void main(String[] args) { // return the  Second largest Number in an array
        int[] arr = {23,1,90,434,45,23};
        int size = arr.length;

        for(int i = 0; i < size; i++){
            for(int j = i + 1; j < size; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr[size-1]);

    }
}
