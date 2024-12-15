package JavaConcepts;
//Overloading Concept
//
public class OverLoading {
    public static void main(String[] args) {
        method("Hello", 45); // when we pass the argument of type string the function that has parameter type as String gets invoke
        method(39); // when we pass the argument of type int the function that has parameter type as int gets invoke
    }
    //both the functions have the same name method
    static void method(int n){// adding a parameter of type String here will throw an error because already function with the same name accepts two parameters One String and One Int
        System.out.println(n);
    }
    static void method(String a, int c){ // This won't give an error.
        System.out.println(a);
        System.out.println(c);
    }
    //A function can have the same name but either  the No.of arguments each function accepts should be different or the type of parameters both the functions accepts should be different
}
