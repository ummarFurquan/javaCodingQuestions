package ObjectOrientedProgramming;
public class Onjects {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        Student student1 = new Student(34, "Ummar Furquan", 90.34f);
        System.out.println(student1.rNo);
        System.out.println(student1.name);
        System.out.println(student1.marks);
        student1.greeting();

    }
}
class Student{
    int rNo;
    String name;
    float marks;


    void greeting(){
        System.out.println("My name is" + name);
    }

    Student(int rollNo, String fullName, float fullMarks){
       this.rNo = rollNo;
       this.name = fullName;
       this.marks = fullMarks;

    }
}
