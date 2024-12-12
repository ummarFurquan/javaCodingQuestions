package BasicQuestions;

import java.util.Scanner;

class SwapUsingMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the two numbers:");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        // Call the swapFunc and store the returned swapped values
        int[] swapped = swapFunc(num1, num2);

        // Print the swapped values
        System.out.println("After swapping:");
        System.out.println("First number: " + swapped[0]);
        System.out.println("Second number: " + swapped[1]);

        in.close(); // Close the scanner
    }

    static int[] swapFunc(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        return new int[]{a, b}; // Return swapped values in an array
    }
}
