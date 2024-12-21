package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] OrrArr = {1,2,3,4,5,6,7,8,9,10,11,22,44,55,90};
        int target = 22;
        int res = search(OrrArr, target);
        System.out.print(res);
    }

    //return the index
    //return -1 if it does not exist

    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length;

        while(start <= end){
            int middle = start + (end - start) / 2;

            if(target < arr[middle]){
                end = middle - 1; // left shift
            } else if (target > arr[middle]) {
                start = middle + 1; // right shift
            } else{
                return middle;   // if target == middle
            }
        }
        return -1; // not found

    }
}
