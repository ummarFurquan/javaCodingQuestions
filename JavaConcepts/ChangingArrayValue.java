package JavaConcepts;

import java.util.Arrays;
//concept of mutability
public class ChangingArrayValue {
    public static void main(String[] args) {
        int[] x = {2,3,4,5,10};
        System.out.println(Arrays.toString(x));// {2,40,4,5,10}
        change(x);
        System.out.println(Arrays.toString(x));


        int[] c = x;
        c[3] = 45;
        System.out.println(Arrays.toString(x)); // Making a copy of the array and then changing the value




    }
    static void change(int[] arr){
        arr[1] = 40;
    }
}
