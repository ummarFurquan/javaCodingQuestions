package BasicQuestions;

import java.util.Scanner;

public class CaseChecker {

    public  static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);

        if(ch >= 'A' && ch <= 'Z'){
            System.out.println("Upper Case");
        } else {
            System.out.println("Lower Case");
        }
    }
}
