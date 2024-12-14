package JavaConcepts;
//Shadowing is a practice of using two variables with the same name withing the scope that is overlaping;
public class Shadowing {
    static int x = 100;
    static int y = 100;//makes x function independent
    public static void main(String[] args) {
        System.out.println(x); // outputs 100
        int x = 30; // the class variable is shadowed with the value present in the higher scope
        System.out.println(x); // outputs 30
        AnotherScope();
        int y; // declaring
//        System.out.println(y); // the scope begins when value is initialized.// Gives an error
        //accessing the variable b/w declaring and initializing
        y = 400; // intializing


    }

    static void AnotherScope(){
        System.out.println(x); // outputs 100
    }
}
