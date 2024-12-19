package DsaQuestions;

public class MinNumWithoutSorting {
    public static void main(String[] args) {
        int[] orArr = {3323,43,23,34,56,6,77,546,57,756};
        int res = min(orArr);
        System.out.println(res);
    }

    static int min(int[] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
