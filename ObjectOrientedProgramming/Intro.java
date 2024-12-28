    package ObjectOrientedProgramming;

    import java.util.Arrays;

    public class Intro {
        public static void main(String[] args) {
            // What if i want to create a data Structure to Store 5  rollNo
            int[] rollNo = new int[5];
            // What if I  want to create a data Structure to store 5 names
            int[] names = new int[5];


            //create a data structure to store the data of 5 students. {rollNO, fullName, marks}

            int[] rollNO = new int[5];
            String[] fullName = new String [5];
            float[] marks = new float[5];

            //But what if you want to store all the three in a single element?
            // WE USE CLASS FOR THIS
            Student sampleName = new Student();
            sampleName.rollNO = 34;
            sampleName.fullName = "Ummar Furquan";
            sampleName.marks = 450.5f;
            sampleName.displayInfo();


            // But there is a better way of doing this, because the above example become repetitive if the instance variables like rollNO fullname and marks are 100 - 200
            //gives the desired output
            Student student2  = new Student();
            System.out.println(student2.rollNO);
            System.out.println(student2.fullName);
            System.out.println(student2.marks);



            Student student3 = new Student(34, "My fullname", 99.5f);
            System.out.println(student3);  // Student{rollNo=34, fullName='My fullname', marks=99.5}4




            //Taking values from another object
            Student random = new Student(sampleName);
            System.out.println(random); //Student{rollNo=34, fullName='Ummar Furquan', marks=450.5}  same as the first example sampleName object

        }
    }
    // This is how we create a class
    //For every single student
    class Student{

        int rollNO;
        String fullName;
        float marks;

    //we need one word to access every object
        // something should automatically put student2

        // If no arguments is passed this gets invoked
        Student(){
            //assigning the values here
            // if you do this it gives error
    //        student2.rollNO = 35;
    //        student2.fullname = "Ummar";
    //        student2.marks  = 45.34f;


            // therefore we use the THIS keyword

            this.rollNO = 34;
            this.fullName = "Ummar Furuquan";
            this.marks = 56.78f;

        }

        //constructor overloading
        //Contructor with the same name as above but it accepts different parameters.
        // When contructor wih three arguments is called this gets invoked

       public Student (int rollNumber, String naam, float percentage){
            this.rollNO = rollNumber;
            this.fullName = naam;
            this.marks = percentage;
        }

        @Override // overiding toString() method
        public String toString() { // to print the output
            return "Student{" +
                    "rollNo=" + rollNO +
                    ", fullName='" + fullName + '\'' +
                    ", marks=" + marks +
                    '}';
        }



        // can we create a constructor that takes values from another object??
        // YES //
        Student(Student other){
            this.fullName = other.fullName;
            this.rollNO = other.rollNO;
            this.marks = other.marks;
        }

        //  A method in class, public -> access modifier: void --> return tpye: displayInfo --> method name
        public void displayInfo(){
            System.out.println("Name is " +  "'" +  fullName + "'" + " Roll No is " +  rollNO  +  " Marks is " + marks );
        }
    }
