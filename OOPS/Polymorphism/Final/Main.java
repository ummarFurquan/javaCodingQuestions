package OOPS.Polymorphism.Final;

public class Main {
    public static  void main(String[] args) {

        Box box1 = new Box();
        Box box2 = new BoxSub();


        BoxSub obj3 = new BoxSub();


        //Even if you can do it via the reference variable the Good convention is to do it via className
        //box1.greeting(); is also allowed
        Box.greeting(); // I am in box Class


        box2.greeting(); // I am in box class  not boxSub class
        obj3.greeting(); // I am in box class(If you remove the greeting method in BoxSub Class)
        //Static method can be inherited but cannot be overridden

        //Assume that the static methods are being inherited there is no point to overRide them in the child class because the method in the parent class
        //will always run no matter from which object you call it

    }
}
