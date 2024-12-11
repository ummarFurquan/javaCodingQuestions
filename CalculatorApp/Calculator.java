package CalculatorApp;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the operator (+, -, *, /, %) or 'x' to exit:");
            char op = in.next().trim().charAt(0);

            if (op == 'x' || op == 'X') {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            System.out.println("Enter the two numbers:");
            int a = in.nextInt();
            int b = in.nextInt();
            int res;

            switch (op) {
                case '+':
                    res = a + b;
                    System.out.println("Answer is " + res);
                    break;
                case '-':
                    res = a - b;
                    System.out.println("Answer is " + res);
                    break;
                case '*':
                    res = a * b;
                    System.out.println("Answer is " + res);
                    break;
                case '/':
                    if (b != 0) {
                        res = a / b;
                        System.out.println("Answer is " + res);
                    } else {
                        System.out.println("Division by zero is not allowed.");
                    }
                    break;
                case '%':
                    if (b != 0) {
                        res = a % b;
                        System.out.println("Answer is " + res);
                    } else {
                        System.out.println("Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid Operator. Please try again.");
            }
        }

        in.close();
    }
}
