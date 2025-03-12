package OOPS.Comparator;

import org.jetbrains.annotations.NotNull;

public class Student implements Comparable<Student>{
    int rollNo;
    String name;
    float marks;


    public Student(int rollNo, String name,  float marks) {
        this.rollNo = rollNo;
        this.name = name;

        this.marks = marks;

    }

    @Override
    public String toString() {
        return "Student{" +
                "name = " + name +
                ", marks= " + marks +
                ", rollNo=" + rollNo +
                '}';
    }

    @Override
    public int compareTo(@NotNull Student o) {
//        System.out.println("In Compare To Method"); // in Test File (Lambda Expression
        int diff = (int)(this.marks - o.marks);
        //if dif == 0 => both are equal
        //if dif < 1 =>  0 is bigger else o is smaller
        return diff;
    }
}
