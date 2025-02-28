package OOPS.Packages.B;

import static OOPS.Packages.A.Greeting.greet;

public class Message {
    public static void main(String[] args) {
    //Importing a greet method from Greeting class which is in package A
           System.out.println("This is Message");
        greet();

    }
}
