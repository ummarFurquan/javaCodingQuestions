package BinarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
//        int[] orArr = {1000,999,982,876,764,650,540,420,310,213,145,99,50,30,20,1}; // decending
        int[] OrrArr = {1,2,3,4,5,6,7,8,9,10,11,22,44,55,90}; // ascending
        int target = 22;
        int res = search(OrrArr, target);
        System.out.println(res);
    }

    static  int search(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        boolean isAsc  = arr[start] < arr[end];

        while (start <= end)
        {

            int middle = start + (end - start) / 2;

            if(target == arr[middle]){
                return middle;
            }

            if(isAsc){
                if(target < arr[middle]){
                    end = middle -  1;
                } else {
                    start = middle +  1;
                }
            }
            else{
                if(target > arr[middle]){
                    end = middle -  1;
                } else {
                    start = middle +  1;
                }
            }

        }
        return  -1;
    }
}
