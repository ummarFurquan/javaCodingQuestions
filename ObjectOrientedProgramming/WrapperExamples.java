package ObjectOrientedProgramming;

public class WrapperExamples {
    public static void main(String[] args) {


        // this works Fine
         final int a = 20;
        final int b = 40;

        swap(a,b);

        //But what if we decalre the same with Wrapper classes

        Integer a1 = 30;
        Integer a2 = 45;
        swap(a1, a2);
        System.out.println(a1  + " "  +a2); // doesn't swap because the wrapper class Integer  is final class
    }

    static void swap( int a, int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a is " + a + " b is " + b);
    }

    static  void  swap2(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}
