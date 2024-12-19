package DsaQuestions;

public class LinearSearch {
    public static void main(String[] args) {
        int[] OrArr = {3,34,23,23,24,154,5,63,41,4};
        int tagrget = 1543;

        boolean res = search(OrArr, tagrget);

        System.out.println(res);

    }

    static boolean search(int[]arr, int n){
        if(arr.length == 0){
            return false;
        }

        for(int index = 0; index < arr.length; index++){
            if(arr[index] == n ){
                return true;
            }
        }
        return false;
    }
}
