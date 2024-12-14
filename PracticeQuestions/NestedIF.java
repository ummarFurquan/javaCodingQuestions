package PracticeQuestions;

import java.util.Scanner;

public class NestedIF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num > 1) {
            System.out.printf("%d", 2);
            if(num > 2){
                System.out.printf("%d", 3);
                if(num>3){
                    System.out.printf("%d",4);
                    if(num > 4){
                        System.out.printf("%d",5);
                    }
                }
            }
        }
        else {
            System.out.printf("%d", 10);
        }
    }
}
