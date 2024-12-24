package DsaQuestions;

import java.util.Arrays;

//Minimum Average of Smallest and Largest Elements
//leetcode 3194
/*
* You have an array of floating point numbers averages which is initially empty.
* You are given an array nums of n integers where n is even.
You repeat the following procedure n / 2 times:
Remove the smallest element, minElement, and the largest element maxElement, from nums.
Add (minElement + maxElement) / 2 to averages.
Return the minimum element in averages.
*
*
* */
public class MinAvgOfSmallestAndLargest {
    public static void main(String[] args) {
        int[] arr = {7, 8, 3, 4, 15, 13, 4, 1};
        double res = minAverage(arr);
        System.out.println(res);

    }
    static double minAverage(int[] nums){
        Arrays.sort(nums);

        int n = nums.length;
        int ans = 1 << 30; //int sum = 1 << 30; assigns the value 1073741824 to the variable sum.

        for (int i = 0; i < n /2; i++) {
                ans = Math.min(ans, nums[i] + nums[n - i -1]);
        }
        return ans/ 2.0;
    }
}
