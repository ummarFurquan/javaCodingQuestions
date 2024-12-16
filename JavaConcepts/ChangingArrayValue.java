package JavaConcepts;

import java.util.Arrays;
import java.util.Scanner;

//concept of mutability
public class ChangingArrayValue {
    public static void main(String[] args) {
//        int[] x = {2,3,4,5,10};
//        System.out.println(Arrays.toString(x));// {2,40,4,5,10}
//        change(x);
//        System.out.println(Arrays.toString(x));
//
//
//        int[] c = x;
//        c[3] = 45;
//        System.out.println(Arrays.toString(x)); // Making a copy of the array and then changing the value
//
//
//
//
//    }
//    static void change(int[] arr){
//        arr[1] = 40;


        //2-D arrays
        Scanner in = new Scanner(System.in);
        int[][] a = new int[3][3]; // Mention the No.of Rows and Columns;

        for(int row = 0;  row < a.length ;  row++ ){
            for (int col = 0; col < a[row].length; col++){
                a[row][col] = in.nextInt();
            }
        }
        for(int[] c : a ){ // for each method, The int[] a tells us that every element os the array is an array itself
            System.out.println(Arrays.toString(c));
        }
        System.out.println();

    }
}
