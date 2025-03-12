package OOPS.Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Test {

    //Using Lambda Expression

    //A lambda expression in Java is essentially a concise way to represent an anonymous function—a block of code that can be passed around and executed later.
    public static void main(String[] args) { // CompareTo is required
        Student mahesh = new Student(23,"Mahesh",  34.45f);
        Student kunal = new Student(23,"kunal",  45.45f);
        Student amogh = new Student(23,"amogh",  56.45f);
        Student nick = new Student(23,"nick",  67.45f);
        Student pratyus = new Student(23,"pratus",  99.45f);
        Student ham = new Student(23,"ham",  10.45f);

        Student[] list = {mahesh,kunal, amogh, nick, pratyus, ham};

        System.out.println(Arrays.toString(list));

        Arrays.sort(list); // by default ascending order

        //You can add a comparator as well
        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
//                return (int)(o1.marks - o2.marks);// ascending Order
                return -(int)(o1.marks - o2.marks);// descending Order
            }
        });


        //You can also write this in a simple way using lambda Expression


        System.out.println(Arrays.toString(list));
        Arrays.sort(list ,(o1, o2) -> -(int)(o1.marks - o2.marks) ); //descending order
        System.out.println(Arrays.toString(list));

    }
}
