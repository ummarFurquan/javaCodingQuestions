package DsaQuestions;

public class MaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr = new int[][]{      // There is no need to add new int[][]
                {1,2,3,4,5,6},
                {99,100, 343,23,4,23},
                {-1,32,43,2,3,35}

        };


        int res = searchMax(arr);
        System.out.println(res);
    }

    static int searchMax(int[][] newArr){
        int max = Integer.MIN_VALUE;
        for (int[] ints : newArr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }

        return max;
    }


}
