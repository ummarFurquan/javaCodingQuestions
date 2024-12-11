package BasicQuestions;

import java.util.Scanner;

public class FiboSeries {

    //based on the input print the fibo number.
    //example if the input is 7 print 13
    // 0 1 2 3 4 5 6 7 // index
    // 0 1 1 2 3 5 8 13
    public static void main(String[] args) {
        System.out.print("Enter the Range");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int zeroth = 0;
        int first = 1;
        int count = 2;
        while(count <= x ){
               int temp = first;
               first = first + zeroth;
               zeroth = temp;
               count++;

        }
        System.out.println(first);
    }
}
