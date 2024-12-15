package JavaConcepts;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        // i can pass any number of arguments
        int response =  sample(1,2,3,4,5,6);
        System.out.print(response);
    }
    static int sample2(int a, int b, int ...c){ // you can have multiple parameters as well Normal arguments and varible arguments (varsrgs should be at the end)
        return 0;
    }
    static int  sample(int ...n){ //can accept any number of arguments and store it like a array of Integers
        System.out.println(Arrays.toString(n));
        int sum = 0;
        for(int i = 0; i<n.length; i++){
            sum = sum + n[i]; // Return the sum of array of integers
        }
        return sum;
    }
}
