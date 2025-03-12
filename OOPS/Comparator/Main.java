package OOPS.Comparator;

import java.util.Arrays;

public class Main  {
    public static void main(String[] args) {
        Student rahul = new Student(34, "Rahul",  45.67f);
        Student amit = new Student(21, "amit",  90.67f);


        //This is one of the methods in which we can compare not the whole object by the particulars of the object
        if(rahul.marks > amit.marks){
            System.out.println("Rahul is Greater");
        } else {
            System.out.println("Amit is greater");
        }

        //Another Method is by using Comparables
        if(rahul.compareTo(amit) < 0){
            System.out.println("Amit has more marks");
        } else{
            System.out.println("Rahul has more marks");
        }


    }



}
