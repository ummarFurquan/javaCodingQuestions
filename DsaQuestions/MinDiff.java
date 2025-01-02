package DsaQuestions;

import java.util.* ;
import java.io.*;
/*
* Given an array of integers, print the minimum of the absolute difference of all possible pairs of elements.*/

public class MinDiff {

    static int minDiff(int n, int[] arr) {
        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;

        for(int i = 1; i < n; i++){
            int diff = Math.abs(arr[i] - arr[i - 1]);
            minDiff = Math.min(minDiff, diff);
        }

        return minDiff;

    }

    public static void main(String[] args) {
        int[] arr = {3, -6, 7, -7, 0 };
        int n = 5;
        int res = minDiff(n, arr);

        System.out.println(res);
    }
}