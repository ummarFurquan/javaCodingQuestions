package JavaConcepts;

import java.util.Scanner;

public class MethodExample {
    public static void main(String[] args) {
        sum();
    }

    static  void  sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the First Number:");
        int num1 = in.nextInt();
        System.out.print("Enter the Second Number:");
        int num2  = in.nextInt();
        int res = num1 + num2;
        System.out.println(res);
    }
}
