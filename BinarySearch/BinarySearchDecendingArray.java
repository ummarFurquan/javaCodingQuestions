package BinarySearch;

public class BinarySearchDecendingArray {
    public static void main(String[] args) {
        int[] orArr = {1000,999,982,876,764,650,540,420,310,213,145,99,50,30,20,1};
        int target = 145;
        int res = search(orArr, target);
        System.out.println(res);
    }

    static int search (int[] arr, int target){
        int start = 0;
        int end = arr.length;
        while(start <= end){
            int middle = start + (end - start) / 2;

            if(target > arr[middle]){
                end =  middle - 1;

            } else if (target < arr[middle]) {
                start = middle +  1;
            }
            else{
                return middle;
            }

        }
        return -1;
    }
}
