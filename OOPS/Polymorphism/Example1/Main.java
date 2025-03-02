package OOPS.Polymorphism.Example1;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circles circle = new Circles();
        Triangle tri = new Triangle();

        Shapes newShape = new Circles();

        circle.area(); // circles
        shape.area(); //shapes
        newShape.area(); // Circles It will have access to the one present on the left hand side


        // Parent also has a method called area() and also the child class has a method called area()
        //The Method in the parent class  is being overridden by Child Class
        Shapes newObj = new Triangle();
        newObj.area();

    }
}
