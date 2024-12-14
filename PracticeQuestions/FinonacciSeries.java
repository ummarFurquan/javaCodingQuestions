package PracticeQuestions;
import java.util.Scanner;

//WAP to accept a number and print fibonacci series till that index
// example n = 10
// 0 1 2 3 4 5 6 7 8 9 10
// 0 1 1 2 3 5 8 13 21 34 // res
public class FinonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int range = in.nextInt();
        int res = fiboSeries(range);
        System.out.print(res);

    }
    static int fiboSeries(int n){

        return 0;
    }
}
