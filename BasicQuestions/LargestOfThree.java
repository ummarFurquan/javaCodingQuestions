package BasicQuestions;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        System.out.print("Enter three Number");
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max = Math.max(c, Math.max(a,b));
        System.out.println(max);

//

//        if(a > b && a >  c){
//            System.out.print(a + " is the largest number");
//        } else if (b > a && b > c ) {
//            System.out.print(b + " is the largest number");
//        }
//        else {
//            System.out.print(c  + " is the largest number");
//        }

    }
}
