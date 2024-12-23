package Strings;

public class Comparison {
    public static void main(String[] args) {



        // example of Immutability
        String original = "Hello";
        System.out.println("Original String: " + original);

        // Attempt to modify the string
        String modified = original.concat(" World");
        System.out.println("Modified String: " + modified);

        // Check if the original string changed
        System.out.println("Original String after modification: " + original);


        //Example of String Pool
        String s1 = "Hello";
        String s2 = "Hello";

        // Strings created using the 'new' keyword
        String s3 = new String("Hello");

        // Check if s1 and s2 refer to the same object in the pool
        System.out.println("s1 == s2: " + (s1 == s2)); // true, both refer to the same object in the pool

        // Check if s1 and s3 refer to the same object
        System.out.println("s1 == s3: "  + (s1 == s3) + " (Before Interning) "); // false, s3 is in the heap, not the pool

        // Intern s3 to force it into the pool
        s3 = s3.intern();

        // Check if s1 and s3 now refer to the same object
        System.out.println("s1 == s3 (after interning): " + (s1 == s3)); // true, both now refer to the same object in the pool
    }
}

