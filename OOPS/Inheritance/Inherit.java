package OOPS.Inheritance;


public class Inherit {
    public static void main(String[] args) {
        Child  obj1 = new Child(34,23,45);
        System.out.println(obj1);//length=34, breadth=23, height=45


        //But Can i access the property of child is do something like
        Parent obj2 = new Child(23,45,78);
//        System.out.println(obj2.area); // This gives an error

        /*
        * When Parent obj2 = new Child(23, 45, 78); is created, the reference type is Parent, so it can only access properties/methods that exist in Parent.
Since area is only in Child, it cannot be accessed using a Parent reference.
This is an example of polymorphism, where the reference type determines what is accessible.*/
        //Child obj3 = new Child(34,23,12); uses Child as both the reference type and object type.
        //Since area exists in Child, it can be accessed normally.

        //But if i do something like
        Child obj3 = new Child(34,23,12);
        System.out.println(obj3.area); // 34 * 23 = 782

        //The above code works! Because This object is created using the Child Class Template Which has Area Property

        //A Child class object always inherits and can access Parent's properties, but if it is referenced as a Parent, it cannot access Child-specific properties.
        //But can also Inherit the properties of its own and also the properties of parent class when Created using its own Template

//        Child obj5 = new Parent(34,56,76);

        //A Parent object cannot be assigned to a Child reference because a Parent is not necessarily a Child. However,
        // a Child object can be assigned to a Parent reference (Upcasting), and Downcasting requires explicit type conversion and must be done carefully.
    }

}

class Parent{ //Parent Class has all the properties
    int length;
    int breadth;
    int height;

    Parent(int length, int breadth, int height){ // Creating a Constructor
        this.length = length;
        this.breadth = breadth;
        this.height = height;
        showMessage();
    }

    void showMessage(){ //Method Inside the Class
        System.out.println("Parent Class");
    }


    @Override
    public String toString() { //TO PRINT
        return
                "length=" + length +
                ", breadth=" + breadth +
                ", height=" + height
                ;
    }
}
class Child extends Parent{
    int area;

    Child(int length, int breadth, int height) { //Creating a constructor inside the Child Class
        super(length,breadth,height); //The Super() keyword is used to call the parent class Constructor inside the child class Constructor
        this.area = length * breadth;
         showMessage();//Super keyword is also used to access the parent class methods
    }


}
