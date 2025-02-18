package Recursion;
//A Recursive Function is a function that calls itself
public class ExampleWithRecursion {
    //What if you want to print number from 1 to 10
    //You don't have to make 10 functions that call one another
    //You can write a recursive function

    public static void main(String[] args) {
        func(1);

    }

    static void func(int n){
        //To stop Printing after 10
        if(n > 10){
            return;
        }
        System.out.println(n);
        //This will keep printing numbers for some values then it throws error
//        func(n + 1);

        func(n + 1);
    }
}
