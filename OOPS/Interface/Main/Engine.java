package OOPS.Interface.Main;
//Multiple Inheritance isn't allowed, so we use Interfaces to achieve it
//Interface supports multiple inheritance
//A Class That Implements an Interface Must Override All Methods
public interface Engine {
    //Interfaces cannot have non static variables
    //int age; // static varibles should be initialised

    static final int Price = 3000000; //Variables are by default public, static and final
            //****Blurred out****/
//    public abstract void start(); // Methods are by default public and  abstract

    //Interface Cannot have constructor
//    public Engine(){
//
//    }

        //Default methods are allowed & they can be overriden
//    default void method(){
//
//    }



    void start();
    void stop();
    void acceleration();
}
