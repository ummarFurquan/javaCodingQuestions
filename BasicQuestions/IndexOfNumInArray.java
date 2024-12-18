package BasicQuestions;

public class IndexOfNumInArray {
    public static void main(String[] args) {
        int[] arr = {23, 43, 54, 64, 23, 34, 4, 67, 23};
        int target = 1;
        int res = occurence(arr, target);
        System.out.print("No.of Occurence of " + target + " is " + res);
    }

    static int occurence(int[] resArr, int tar){
        int count = 0;
        for(int i = 0; i < resArr.length; i++){
            if(resArr[i] == tar){
                count++;
            }

        }
        return  count;

    }
}
