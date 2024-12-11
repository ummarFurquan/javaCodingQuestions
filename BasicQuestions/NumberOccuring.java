package BasicQuestions;

import java.util.Scanner;

public class NumberOccuring {
    public static void main(String[] args) {
        System.out.print("Enter the number");
        Scanner inputNumber = new Scanner(System.in);
        int n = inputNumber.nextInt();
        System.out.print("Enter the number to be found");
        Scanner numberFind = new Scanner(System.in);
        int x = numberFind.nextInt();

        while(n > 0){
            int rem = 0;

            rem = n % 10;
            if(n == x){
                int count = 0;
                count++;

            }

            System.out.print("The number " + n + " occured " + count + "Times");
        }

    }
}
