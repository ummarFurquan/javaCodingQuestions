package OOPS.Comparator;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;

public class LambdaExpression {
    public static void main(String[] args) {

        ArrayList<Integer> arr  = new ArrayList<>();

        for (int i = 0; i <  5; i++) {
            arr.add( i * 2);
        }

        //Instead of writing a for loop and print statement, both are written in the same line
        arr.forEach(System.out::println); // 0 2 4 6 8

        System.out.println(" ");
        Consumer<Integer> dun = (integer -> System.out.println(integer * 2));
        arr.forEach(dun);
    }

    public int add(int a, int b){
        return  a  + b;
    } // this is a normal method but this can be written in one line using lambda expressions

    //Lambda Expressions are in line expressions and in situation where you don't need the name of the function
}
