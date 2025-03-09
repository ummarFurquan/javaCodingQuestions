package CustomArraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Creating our own arraylist

//<T extends Number> are wildcards that allow you to specify the type of data types
//In this case the data types can be Integer or subclasses of Integers
public class CustomArrayListGeneric <T extends Number> { // T stands for the type

    private Object[] data;
    private static int defaultSize = 10;
    private int size = 0;

    private T t;


    public CustomArrayListGeneric() {
        this.data = new Object[defaultSize]; // Uses the static defaultSize
    }

    public CustomArrayListGeneric(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        }
        this.data = new Object[initialCapacity];
    }

    public void add(T num){ // adds elements in arraylist
        if(isFull()){ // If the user adds elements more than the Original Size
            resize(); // Resize the arraylist and add the element into it
        }
        data[size++] = num;
    }

    public void getList(List< ? extends Number> list){ // You can pass number type and subclasses of it as well

    }

    private void resize() {
        Object[] temp = new Object[data.length * 2]; // doubles the size of the arraylist when user enters data which is more than the initial capacity

        //copy the elements in the new array
        for (int i = 0; i < data.length ; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
    return size == data.length; // returns 1 if the size is equal to data.length
    }

    public T remove(){
        // Decrement the Size by One or remove the last element
        T removed = (T)(data[--size]);
        return removed;
    }

    public T get(int index){
        return (T)data[index];
    }

    public int size(){
        return size;
    }

    public void set(int indexValue, T value){

        data[indexValue] = value;
    }

    @Override
    public String toString() {
        return "CustomArrlist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {

       CustomArrayListGeneric<Integer> newlist = new CustomArrayListGeneric<>();
       newlist.add(23);
       newlist.add(23);
       newlist.add(23);
       newlist.add(23);
        System.out.println(newlist);

        CustomArrayListGeneric<Integer> list6 = new CustomArrayListGeneric<>(30); // you can add Integer data types(Wrapper Classes)
        //OR
        CustomArrayListGeneric<Number> list10 = new CustomArrayListGeneric<>(30); // you can also add Integer data types(Wrapper Classes)

        //Number is the Parent Class and Integer is the Sub Class
        //public final class Integer extends Number







    }
}
