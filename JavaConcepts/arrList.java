package JavaConcepts;

import java.awt.desktop.ScreenSleepEvent;
import java.rmi.UnexpectedException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arrList{
    public static void main(String[] args) {
//        ArrayList<Integer> list  = new    ArrayList<>(10);
//        //multiArrayList
//        ArrayList<ArrayList<Integer>> arr  = new ArrayList<>(20);
//        // methods of array  List
//
//
//        ArrayList<Integer> listCopy  = new    ArrayList<>(10);
//        list.add(232323);
//        list.add(232323);
//        list.remove(1);
//
//        System.out.println(list);


        // How to take input and stor it in a Multi Array list


        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arr3 = new ArrayList<>(5);


        //Initialisation
        for(int i = 0;  i < 3; i++){
            arr3.add(new ArrayList<>());
        }

        //ADD ELEMENTS
            for(int i = 0; i < 3 ; i++ ){
                for(int j = 0; j < 3; j++){
                    arr3.get(i).add(in.nextInt());
                }

            }
        System.out.println(arr3 + " ");


    }
}

