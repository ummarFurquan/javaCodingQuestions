package DsaQuestions;

import java.util.Arrays;

//Given an array nums of integers, return how many of them have even number of digits
//leetcode 1295
public class CountTheNumberOfDigits {
    public static void main(String[] args) {

        int[] arr = {12,345,2,6,7896};

        int res = evenNumberArray(arr);
        System.out.println(res);

    }

    static int evenNumberArray(int[] newArr){
        int count = 0;
        for(int i : newArr){
            if (even(i)) {
                count++;
            }

        }
        
        
        return count;
    }

    private static boolean even(int nums) {

        int numberOfDigits = digits(nums);
        return numberOfDigits % 2 == 0;

    }
    static int digits(int num){
        int count = 0;
        while(num  > 0){
            count++;
            num = num / 10;
        }
        return count;
    }
 }
