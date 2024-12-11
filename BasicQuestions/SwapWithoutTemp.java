package BasicQuestions;

public class SwapWithoutTemp{
    public static void main(String[] args){
        int a = 10;
        int b = 34;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;


        //Arithmetic Operations
        /*
        * a = a * b;
        * b = a / b;
        * a = a / b;
        * */

        //Using temp variable
        /* int temp = 0;
         * temp = a;
         * b = a;
         * b = temp;
         * */

        //Without temp variables
        /*
         * a = a + b;
         * b = a - b;
         * a = a - b;
         * */



        System.out.println(a);
        System.out.println(b);

    }
}
