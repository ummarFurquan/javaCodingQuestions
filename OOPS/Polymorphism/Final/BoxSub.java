package OOPS.Polymorphism.Final;

public class BoxSub extends Box { // If the Box class is Final the BoxSub cannot inherit it


    //We have a greeting method in Box Class as well which is static

//    @Override // This method
    static void greeting(){
        System.out.println("I am in BoxSub Class");
    } // Comment this out and check output in the main file
}


//Overrding depends on objects
//Static is independent of objects
//Therefore static methods cannot be overridden