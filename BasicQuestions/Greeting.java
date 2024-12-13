package BasicQuestions;


import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String message = in.next();
        String greeting = greet(message); //Storing the Method in a String data type and passing arguments
        System.out.print(greeting);

    }

   static  String greet(String  name){    // greet method that accepts String data type as a parameter and returns a String
       return "Hello " + name;
    }
}
