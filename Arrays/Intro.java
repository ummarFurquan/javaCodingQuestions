package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
//        int[] a;
        /*Declaration  of an array with the reference name a that accepts int data type.
        The size of the array is not defined
        a is defined in the stack
        */
//        int[] b = new int[5];
        // Initialisation of an Array with size 5
        // The new keyword is used to allocate memory for the array and initialize its elements
        Scanner in = new Scanner(System.in);
//        // Array of Primitive
//        int[] c = new int[5];
//        for (int i = 0; i <c.length ; i++) {
//            c[i] = in.nextInt();
//        }
//
//        System.out.println(Arrays.toString(c)); // without for loop
//        for (int j : c ) { // normal for loop
//            System.out.print(j  + " ");
//        }
//        System.out.print("\n");
//        for (int j : c ) { // forEach Method
//
//            System.out.print(j  + " ");
//        }
        String[] str = new String[5];

        for (int i = 0; i < str.length ; i++) {
            str[i] = in.next();
        }
        str[4] = "Name"; // accessing with the index and changing the value
        System.out.print(Arrays.toString(str));


    }
}
