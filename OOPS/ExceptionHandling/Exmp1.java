package OOPS.ExceptionHandling;

public class Exmp1 {
    public static void main(String[] args) throws InterruptedException {
        int a = 45;
        int b = 0;
        try {
//            divide(a,b);
            String name  = "Name";
            if (name.equals("Name")){ // this is our Custom Exception
                throw new CustomException("Same Name");
            }
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } catch (Exception e){ // If this block in at the top the other exceptions are not checked because this is Main class and other exceptions inherit from this class
            //So make sure the strict exception are at top
            System.out.println(e.getMessage());
        } finally { // Adding this depends on the developer and you can only have one finally block
            System.out.println("This always executes");
        }
    }

    static int divide(int a, int b) throws  ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("B should not be zero");
        }
        return a / b;
    }
}
