package ObjectOrientedProgramming;

public class Intro {
    public static void main(String[] args) {

        //Reference Sharing
        /*
        * If two variables in the stack are referencing the same
        * object in the heap, then modifying the object using one variable will reflect the
        *  change when accessed through the other variable. However, the variables themselves remain independent;
        *  only the object they point to is shared and modified.
        * */
            // Create an object and assign it to variable 'a'
            MyObject a = new MyObject();
            a.value = 10;

            // Assign the reference of 'a' to 'b'
            MyObject b = a;

            // Print the initial values
            System.out.println("Before modification:");
            System.out.println("a.value: " + a.value); // Output: 10
            System.out.println("b.value: " + b.value); // Output: 10

            // Modify the object using 'b'
            b.value = 20;

            // Print the values after modification
            System.out.println("After modification:");
            System.out.println("a.value: " + a.value); // Output: 20
            System.out.println("b.value: " + b.value); // Output: 20
        }
    }

// A simple class with one field
        class MyObject {
    int value;
}