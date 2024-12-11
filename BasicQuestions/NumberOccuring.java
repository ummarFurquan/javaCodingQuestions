package BasicQuestions;


public class NumberOccuring {
    public static void main(String[] args) {
        int n = 1234455;
        int a  = 5;
        int count = 0;
        while(n > 0){

           int  rem = n % 10;
            if(rem == a){
                count++;
            }
                n = n / 10;
        }
        System.out.println(count);
    }
}
