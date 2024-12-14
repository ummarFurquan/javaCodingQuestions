package PracticeQuestions;

import java.util.Scanner;

public class HasVowelOrNot {
    public static void  main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String");
        String str = in.next();
        System.out.println(checker(str));
    }

    static boolean checker(String str){
        return str.toLowerCase().matches(".*[aeiou].*");
    }
}

