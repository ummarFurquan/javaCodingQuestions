package OOPS.Polymorphism.Example2;

public class Numbers {

    //This is an example of compile time polymorphism or static polymorphism
    int sum(int  a, int b){
        return a + b;
    }

    int sum(int a, int b, int c){
        return a + b + c;

    }


    //This constructor accepts double as input

    double sum(double a, double b){
        return a + b;
    }

    public static void main(String[] args) {
        Numbers obj1 = new Numbers();
        obj1.sum(3,4);
        obj1.sum(1,2,3);
//        obj1.sum(1); // Gives and error becuase there is no method that takes one parameter as argument



        // Concept of automatic casting
            obj1.sum(2.4,4.4); //The method that accepts double as arguments gets invoked!

        //But we can pass int values to this constructor as well
        //Concept of type casting and conversion

        obj1.sum(3.4, 2); // There is no method that takes one argument as double and one as int.

        //The double can be converted into int but this results in data loss!

        //Read more  https://net-informations.com/java/basics/casting.htm
    }
}
