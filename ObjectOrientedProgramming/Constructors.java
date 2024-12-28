package ObjectOrientedProgramming;

public class Constructors {
    public static void main(String[] args) {


        // now I want to call the contructor which accepts 3 parameters to be called when ever i call the NewStudent() constructor
        // calling one constructor from another constructor
        NewStudent randomeCall = new NewStudent();
        randomeCall.displayDetails();  //Student{rollNo=34, fullName='Mohammed Ummar', marks=100.0}
    }
}

class NewStudent{
    int roll;
    String FullName;
    float percentage;



    NewStudent(){

        //internally it is new NewStudent();
        this(34, "Mohammed Ummar", 100.0f);
    }


    public void displayDetails() {
        System.out.println("Roll No: " + roll);
        System.out.println("Full Name: " + FullName);
        System.out.println("Percentage: " + percentage);
    }

    NewStudent(int RollNo, String YourName, float fullMarks){
        this.roll = RollNo;
        this.FullName = YourName;
        this.percentage = fullMarks;
    }
}
