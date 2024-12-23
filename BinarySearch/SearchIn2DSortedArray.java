package BinarySearch;

import java.util.Arrays;

public class SearchIn2DSortedArray {
    public static void main(String[] args) {
        int[][] aorArr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int target = 5;
        int[] res = search(aorArr, target);
        System.out.println(Arrays.toString(res));
    }

    // Binary search in a single row between colStart and colEnd
    static int[] individualSearch(int[][] arr, int row, int colStart, int colEnd, int target) {
        while (colStart <= colEnd) {
            int middle = colStart + (colEnd - colStart) / 2;
            if (arr[row][middle] == target) {
                return new int[]{row, middle};
            }
            if (arr[row][middle] < target) {
                colStart = middle + 1;
            } else {
                colEnd = middle - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] arr, int target) {
        int row = arr.length;
        int col = arr[0].length; // matrix may be empty

        if (col == 0) {
            return new int[]{-1, -1};
        }

        if (row == 1) {
            return individualSearch(arr, 0, 0, col - 1, target);
        }

        int rowStart = 0;
        int rowEnd = row - 1;
        int middleColumn = col / 2;

        // Binary search in middle column to find the correct row
        while (rowStart < (rowEnd - 1)) { // More than two rows remaining
            int middle = rowStart + (rowEnd - rowStart) / 2;

            if (arr[middle][middleColumn] == target) {
                return new int[]{middle, middleColumn};
            }
            if (arr[middle][middleColumn] < target) {
                rowStart = middle;
            } else {
                rowEnd = middle;
            }
        }

        // Check the middle column of the two remaining rows
        if (arr[rowStart][middleColumn] == target) {
            return new int[]{rowStart, middleColumn};
        }
        if (arr[rowStart + 1][middleColumn] == target) {
            return new int[]{rowStart + 1, middleColumn};
        }

        // Search in 4 quadrants
        if (target <= arr[rowStart][middleColumn - 1]) {
            return individualSearch(arr, rowStart, 0, middleColumn - 1, target);
        }
        if (target >= arr[rowStart][middleColumn + 1] && target <= arr[rowStart][col - 1]) {
            return individualSearch(arr, rowStart, middleColumn + 1, col - 1, target);
        }
        if (target <= arr[rowStart + 1][middleColumn - 1]) {
            return individualSearch(arr, rowStart + 1, 0, middleColumn - 1, target);
        } else {
            return individualSearch(arr, rowStart + 1, middleColumn + 1, col - 1, target);
        }
    }
}
