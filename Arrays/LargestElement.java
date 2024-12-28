package Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,12,34,56,100,500};

        System.out.println(search(arr));
    }


    static int search(int[] arr){
        int largest = arr[0];
        int i = 0;
        for(i = 0; i < arr.length;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return i;
    }
}
