package OOPS.Abstraction;

import com.sun.source.tree.ParenthesizedTree;

//If a class is abstract it cannot be final becuase abstract classes should be extended(inherited) by another class and final restricts inheritance!
//Abstact class cannot be static and final

abstract class Car { // If a class contains one or more abstract methods  then the class should also be abstract
        abstract public  void fuelType(); // THe abstract method does not consist of a body
        //There are two types of methods 1. Abstract Method and Concrete Method.
        //1. Abstract Method does not contain a body
        //2. Concrete Method should contain a body
        public void fuelCapacity(){ // Abstract Classes can contain normal methods as well
            System.out.println("450 LTrs");
        }

        //Decalring Variables is also allowed
        int tank = 45;

        //Creating Normal Constructor is allowed
        public Car(int tank){
            this.tank = tank;
        }

        //Creating Normal Constructor isn't allowed
//        abstract public Car(){
//
//        }




    //Can we Create abstact static methods?
//    static abstract public Car(){
//
//    }

    //NO because static methods cannot be overridden
    //And when A child Class is creating it should override the abstract classses

    //But you can create only static methods
    static public void design(){
        System.out.println("Design");
    }

}

//THis is the error we get as soon as we create a class that extends Car class
//class Mahindra extends Car{  //Class 'Mahindra' must either be declared abstract or implement abstract method 'fuelType()' in 'Car
//}

// When creating a child class make sure that the method(s) in child class must override the abstract methods in the parent class

//even Abstact Classees cannot Extend(Inherit) More than one Class
class Mahindra extends Car{
    public Mahindra(int tank) {
        super(tank);
    } // The constructor in the Parent class is being called via super();

    @Override
    public void fuelType(){
        System.out.println("Over Riding the Fuel Type Method"); // Overriding the fuelType method from the Car class (Parent class)
    }
}

class Body {

}


public class Test {
    public static void main(String[] args) {

//         Car nexon = new Mahindra(45); // Upcasting also allowed
        Mahindra nexon = new Mahindra(45); // This is also allowed
        nexon.fuelType();
        nexon.fuelCapacity();


        //with the constructor

        Car tata = new Car(45) { //But when calling the constructor it throws the same error as in line 60
            //Implement the same methods
            @Override
            public void fuelType() {
                System.out.println("Construtor");
            }
        };
        Car.design(); // Pure Static Method in abstract class is allowed!



        //Creating Objects of abstract classes isn't allowed
//        Car car = new Car(); // Throws error
        //You should implement the methods that you created in the Parent Class
        Car thisCar = new Car(45) {
            @Override
            public void fuelType() {
                System.out.println("You Cannot Create Objects of abstract classes, unless you override the methods present inside them! "); // Something like this
            }
        };
    }
}


