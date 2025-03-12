package OOPS.ObjectCloning;
// There is one interface in the lang package Called Cloneable
// We should implement that interface in the class whose copy is to be created
//Here I want to create a  copy of an object of Class Human

import java.util.Arrays;

//If Cloneable is not added, program throws CloneNotSupportedException
public class Human implements  Cloneable{
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[] {1,2,3,4,5,6};
    }
        // This constructor accepts another object!
    public Human(Human other) { // This is one way to clone object
    this.age = other.age;
    this.name = other.name;
    }

//    @Override
//    public String toString() {
//        return "Human{" +
//                "age=" + age +
//                ", name='" + name + '\'' +
//                '}';
//    }


    @Override
    public String toString() {
        return "{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    @Override // Just to check
    //This is a faster method to clone objects
    public Object clone() throws CloneNotSupportedException{ // make sure you add CloneNotSupportedException because "protected native Object clone() throws CloneNotSupportedException";

        //This is Shallow Copy
        //Shallow Copy for primitives will create a new copy but for object and non primitive the copied object  will point to the original object
//        return super.clone();

        //Deep copy
        Human twin = (Human)super.clone();

        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length ; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}
