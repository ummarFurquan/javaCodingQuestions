package PracticeQuestions;


public class ArmstongNum {
    public static void main(String[] args) {

        for(int i =1; i<=1000; i++){
            if(ArmstongChecker(i)){
             System.out.print(i + " ");
            }
        }

    }

    static boolean ArmstongChecker(int n){
        int original = n;
        int sum = 0;
        int digits = String.valueOf(Math.abs(n)).length();
        while(n > 0){
            int rem = n % 10;
            n = n/ 10;
            sum = sum + (int) Math.pow(rem, digits);
        }
        return sum == original;
    }
}
