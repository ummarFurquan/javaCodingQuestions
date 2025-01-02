package Packages.B;

import static Packages.A.A.greeting; // the package can be imported using the import statement.

public class B {
    public static void main(String[] args) {
        System.out.println("This is the Package B from class B");
        greeting(); // this method is from the Package A class A



    }
}
