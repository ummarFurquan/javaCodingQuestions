package OOPS.Polymorphism.Example1;

public class Triangle extends Shapes {
    @Override //THe Super Class has a method Called area, added it here to just check if it is actually overriding
    //When an object is created using Shapes newObj = new Triangle();
    void area(){
        System.out.println("Triangle");
    }

//    @Override // There is no method called show() in the Shapes Class / So there is no OverRide Happening Here
    void show(){
        System.out.println("Not Overriding");
    }
}
