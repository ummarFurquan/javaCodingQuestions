package CustomArraylist;


import java.util.ArrayList;
import java.util.Arrays;

//Creating our own arraylist
public class CustomArrlist{

    private int[] data;
    private final static int defaultSize = 10;
    private int size = 0;


    public CustomArrlist() {
        this.data = new int[defaultSize]; // Uses the static defaultSize
    }
    public CustomArrlist(int initialCapacity) {
        this.data = new int[initialCapacity];
    }

    public void add(int num){ // adds elements in arraylist
        if(isFull()){ // If the user adds elements more than the Original Size
            resize(); // Resize the arraylist and add the element into it
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];

        //copy the elements in the new array
        for (int i = 0; i < data.length ; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
    return size == data.length; // returns 1 if the size is equal to data.length
    }

    public int remove(){
        // Decrement the Size by One or remove the last element
        return data[--size];
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int indexValue, int value){
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
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(34);
        int n = list.size();
        System.out.println(n);

        CustomArrlist list1 = new CustomArrlist();
        list1.add(23);
        System.out.println(list1); //CustomArrlist{data=[23, 0, 0, 0, 0, 0, 0, 0, 0, 0], size=1}

        CustomArrlist list3 = new CustomArrlist();
        for (int i = 0; i < 13; i++) {
            list3.add(i);
        }


        CustomArrlist list5 = new CustomArrlist(30);
        //The size changes if the size is more than the default size
        System.out.println(list3); //CustomArrlist{data=[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 0, 0, 0, 0], size=13}
        //But we can add String, characters and many more data types, also custom data types, we can achieve this by using generics

        ArrayList<Integer> newList = new ArrayList<>(); //only integer data types can be added in this list

        //Generics :- Generics in Java are a feature that allows for the creation of parameterized types, enhancing type
        // safety and code reusability by enabling classes, interfaces, and methods to work with various data types without the need for explicit type casting.
        int sizearray = newList.size();
        System.out.println(sizearray);
    }
}
