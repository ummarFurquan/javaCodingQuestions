package JavaConcepts;

import java.util.Arrays;

public class Ambiguity {
    public static void main(String[] args) {
        demo("Hello"); // prints hello
        demo(1,30,20,40); // prints the sum 91
//        demo(); // throws error because of the concept of ambiguity
    }

    static void demo( String ...arr){
        System.out.println(Arrays.toString(arr));
    }
    static void demo(int ...arr){
        int sum = 0;
        for (int j : arr) {
            sum = sum + j;
        }
        System.out.println(sum);
    }
}
