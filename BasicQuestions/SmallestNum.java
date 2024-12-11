package BasicQuestions;

public class SmallestNum {

    public static void main(String[] args){

        int[] arr = {1,-1, 5,10000, 3, 0};
        System.out.println(arr[0]);
        int prop = arr[0];
        System.out.println(prop);
        System.out.println(MinArr(arr));


    }

    public static int MinArr(int[] arr){

        if(arr == null || arr.length == 0){
            throw  new IllegalArgumentException("Array cannot be null or Empty");
        } else {
            int min = arr[0];
            for(int i = 0; i < arr.length;i++){
                if(arr[i] < min  ){
                    min = arr[i];
                }
            }
            return min;
        }

    }
}