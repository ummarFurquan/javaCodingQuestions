package DsaQuestions;
import java.sql.Array;
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,12,23,90,100};
        int[] resArr;
        for(int i = 0; i < arr.length;i++){
            if(arr[i] != 5){
                arr[i] = 5;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}