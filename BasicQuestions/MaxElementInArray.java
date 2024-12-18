package BasicQuestions;

public class MaxElementInArray {
    public static void main(String[] args) {
        int[] arr = {34,3,23,34,35,234,13,143,52};
        System.out.println(max(arr));
        
    }

    private static int max(int[] arr) {
    int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
            }
        }
        return max;
    }
}
