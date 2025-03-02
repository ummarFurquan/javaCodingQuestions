package OOPS.Inheritance;

public class MultilevelInheritance {
    public static void main(String[] args) {
        A obj = new C   ("Java Inheritance");
        System.out.println(obj);  // Output: Java Inheritance
    }
}

// Parent Class (Base Class)
class A {
    String knowledge;

    A(String knowledge) {
        this.knowledge = knowledge;
    }

    @Override
    public String toString() {
        return knowledge;
    }
}

// Child Class (Intermediate Class)
class B extends A {
    B(String knowledge) {
        super(knowledge); // Call A's constructor
    }
}

// Grandchild Class (Derived from B)
class C extends B {
    C(String knowledge) {
        super(knowledge); // Call B's constructor (which calls A's constructor)
    }
}
