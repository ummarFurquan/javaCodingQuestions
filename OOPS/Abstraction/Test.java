package OOPS.Abstraction;

abstract class Car { // When creating an abstract method make sure the class is also abstract
        abstract public  void fuelType(); // THe abstract method does not consist of a body
        public void fuelCapacity(){ // Abstract Classes can contain normal methods as well
            System.out.println("450 LTrs");
        }

}

//THis is the error we get as soon as we create a class that extends Car class
//class Mahindra extends Car{  //Class 'Mahindra' must either be declared abstract or implement abstract method 'fuelType()' in 'Car
//}

class Mahindra extends Car{
    @Override
    public void fuelType(){
        System.out.println("Over Riding the Fuel Type Method"); // Overriding the fuelType method from the Car class (Parent class)
    }
}


public class Test {
    public static void main(String[] args) {

        Mahindra nexon = new Mahindra();
        nexon.fuelType();
        nexon.fuelCapacity();
    }
}


