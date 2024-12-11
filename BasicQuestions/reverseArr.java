package BasicQuestions;

public class reverseArr {

    static  void reverse(int[] arr){
        int len = arr.length;

        for(int i = 0; i < len/2; i++){
            int temp = arr[i];
            arr[i] = arr[len - i - 1];
            arr[len - i -1] = temp;

        }
    }
    public static void main(String[] args){
        int[] arr = {1,3,2,4,5,6};
        reverse(arr);

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
