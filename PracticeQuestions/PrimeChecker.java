package PracticeQuestions;

import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.print(checker(number));

    }
    static boolean checker(int n){
        if(n == 0 || n == 1){
            return false;
        } if(n == 2){
            return true;
        }
        for(int i = 2; i <= n/2; i++){   /*Better Approach for(int i = 2; i<=Math.sqrt(n);i++*/
            if(n % 2 == 0){
                return  false;
            }
        }
        return true;
    }
}
