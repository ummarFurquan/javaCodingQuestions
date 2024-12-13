package BasicQuestions;

import java.util.Scanner;

public class GreetingAnotherExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        String greeting  = greet(name);
        System.out.println(greeting);


    }
static String greet(String name) {
        String res = "Hello" + name;
        return res;
}
}
