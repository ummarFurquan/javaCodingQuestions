package BasicQuestions;

public class Factorial {
    static int checkFactorial(int n){
        int res = 1;
        for(int i = 1; i<= n; i++){
            res = res * i;

        }
        return  res;
    }
    public static void main(String[] args){
        int result = checkFactorial(5);
        System.out.println("Facorial is " + result);
    }

}
