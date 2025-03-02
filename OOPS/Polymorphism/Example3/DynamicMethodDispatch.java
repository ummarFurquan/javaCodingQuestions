package OOPS.Polymorphism.Example3;

public class DynamicMethodDispatch {
    //Better Understanding of How DMD works and what is RunTime polymorphism or Dynamic Polymorphism
    static class A {
        void first(){
            System.out.println("Class A ");
        }
        void second(){
            System.out.println("Second");
        }
    }
    static class  B extends  A{
        void first(){
            System.out.println("Class B");
        }

        void unique(){
            System.out.println("Unique");
        }
    }

    //Here main is not static because the classes A and B are non static
    //****Important Concept **** you cannot access something which is not static into something which is static but vice versa is possible
    //Either Make main static or Make A & B both static
    public static void main(String[] args) {
     A obj1 = new A(); //Object Created with the Parent class has all the properties of that particular class
        obj1.first(); // Class A
        obj1.second(); // Second
     B obj2 = new B();
        obj2.first(); // This method is being overridden by DMD Class B
        obj2.second(); // Because there is no method that is second() in the parent class is not being overridden  // Second


        // But what if i do

        A obj3 = new B(); // Here we can access both second and first but not the unique method
        obj3.second();
        obj3.first();
//        obj3.unique // obj3 cannot access unique() method


        //But what if i Create an object by

        B obj4 = new B();

        //I can access all the three!
        obj4.second();
        obj4.first();
        obj4.unique();



        // The One on the left hand side determines what properties can be accessed!



        // But there is a way to access properties of B class by reference objects poiting to A class and Stored in A class
        // By DownCasting

        //Now

        A newObj = new B(); // First upcasting

//        newObj.unique(); // Cannot be accessed, The reference variable newobj can only access method in A even though it is actually pointing to B object

        B anotherObj = (B) newObj; // Then downcasting

        anotherObj.unique(); // Downcasting the Class A to B so that i can access the unique method

        //But why the extra step of Upcasting and then downcasting

        //Java allows it only if the object was originally created as a B instance.





    }
}
