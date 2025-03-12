package OOPS.ObjectCloning;

import java.io.ObjectStreamException;
import java.util.Arrays;

public class Main  {

    //Object Cloning
    //Creating an exact copy of an object


    public static void main(String[] args) throws CloneNotSupportedException {
        Human kunal = new Human(34, "Name"); // This is to create an object

        //This is a simple way of creating a clone of the object
        Human twin = new Human(kunal); // This accpets the object created

        System.out.println(twin); // Human{age=34, name='Name'}



        //This is using the clone() method in the object Class
        Human twin1 = (Human)kunal.clone();
        System.out.println(twin1);


        //Shallow copy and Deep copy
        //Prim
        //Shallow Copy
        twin1.arr[2] = 300;
        System.out.println(twin1); //{arr=[1, 2, 300, 4, 5, 6]}
        System.out.println(kunal);//{arr=[1, 2, 300, 4, 5, 6]}

        //For primitives the value it will create a new object and for non primitive it points to the original data
        twin1.age = 45;
        System.out.println(twin1); //Human{age=45, name='Name'}
        System.out.println(kunal); //Human{age=34, name='Name'}


        System.out.println("deep Copy");
            //The value of only  twin array is changed
        twin1.arr[4] = 45;
        System.out.println(Arrays.toString(twin1.arr)); //[1, 2, 300, 4, 45, 6]
        System.out.println(Arrays.toString(kunal.arr));  //[1, 2, 3, 4, 5, 6]
    }
}
