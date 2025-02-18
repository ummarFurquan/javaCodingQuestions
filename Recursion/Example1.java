package Recursion;

public class Example1 {
    public static void main(String[] args) {
        firstFunction(1);
    }
    static void firstFunction(int n ){
        System.out.println(n);
        SecondFunction(2);
    }
    static void SecondFunction(int n ){
        System.out.println(n);
        ThirdFunction(3);
    }
    static void ThirdFunction(int n ){
        System.out.println(n);
        FourthFunction(4);
    }
    static void FourthFunction(int n ){
        System.out.println(n);
        FifthFunction(5);
    }
    static void FifthFunction(int n ){
        System.out.println(n);
        SixthFunction(6);
    }
    static void SixthFunction(int n ){
        System.out.println(n);
        SeventhFunction(7);
    }
    static void SeventhFunction(int n ){
        System.out.println(n);
    }
}
