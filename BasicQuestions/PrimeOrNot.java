package BasicQuestions;

public class PrimeOrNot {
    static boolean checkPrime(int a){
     if(a<= 1){
         return false;
     }
     for(int c = 2; c * c <= a; c++){
         if(a % c == 0){
             return false;
         }
     }
     return true;
    }

    public static void main(String[] args){
        System.out.println(checkPrime(5));
    }

}

