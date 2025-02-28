package OOPS.Classes;
                                        //Classes Objects Contructor This Keyoword New keyword


public class Classes {

    public static void main(String[] args) {
        Student[] students = new Student[5]; // This creates an array of 5 Students with Student Data - type. It contains rollNo Marks and Name
        // Creating a Single Entry

//        Student harry = new Student(); // First Constructor
        // This part is declaring
        //This Part happens at the compile Time
        //Student IS the class Name
        // Harry is the reference Variable
        //-------*---------//




        //This part is the Initalizing (new Student();)
        //This part happens at the compile Time
        //The new keyword does DMA (Dynamic Memory Allocation) at run time and return a reference variable to it
        //That Particular refernce is Stored in Student() This is also known as Default  Constructor;


        //How can you add Entries in this object Harry of Class Students?

//        harry.Name = "Harry Code";
//        harry.rollNo = 34;
//        harry.marks = 56.0f;

//        //Displays Respetive Values
//        System.out.println(harry.rollNo);
//        System.out.println(harry.Name);
//        System.out.println(harry.marks);

//        //With Constructor
//        System.out.println(harry.rollNo);
//        System.out.println(harry.Name);
//        System.out.println(harry.marks);



        Student Mark = new Student(34, "Mark Spencer", 56.0f); // This is another way of passing values to the reference variables of the class.
        //Here Mark is an object

        System.out.println(Mark.rollNo);
        System.out.println(Mark.Name);
        System.out.println(Mark.marks);


        Mark.greeting();

        //34
        //Mark Spencer
        //56.0

        Student callingConstructor = new Student();



        //Final Keyword

        //In Primitives
        //   final Integer a = 10;
//    a = 56;
//        System.out.println(a);
// Won't let you change the value

        //In reference Types

        //You cannot reassign a final (obj) reference varibale to another reference variables
        // But you can change the value of the objects
        final Student finalVar = new Student();
//        finalVar = new Student(); // cannot reassign it



    }
    }
    class  Student{
        int rollNo;
        String Name ;
        float marks;

// Construcor where we are asssigning values


        // Example of Calling a contructor Via Another Constructor

        //This Student() constructor calls The similar named Constructor Student that accpets there parameters
        Student(){
            this (13, "Random Name", 56.0f);
        }


        //Lets Create another method called Greeting that takes a String as a Parameter and returns it
        void greeting(){
            System.out.println("The name that is entered is"  + this.Name);
        }

        //Another Constructor that accepts 3 parameters rollNo Name and Marks
        Student(int Roll, String Naam, float marksTotal){
            this.rollNo = Roll;
            this.Name = Naam;
            this.marks = marksTotal;

            //The this keyword is replaced with the object name That is given at the Compile Time
            //In this case it is Mark
            //Internally the this keyword is replaced with
            // mark.rollNo = Roll (15)
            // mark.Name =  Naam (Mark Spencer)
            // mark.marks  = marksTotal (56.0)




            //Finalize Keyword

            A obj;
            for(int i = 0; i < 100000000; i++){
                obj = new A("Created");

                //Object Gets Created
                //Object Gets Destroyed qqqq
            }

        }

}


class  A {
    final int num = 10;
    String name;

    public A (String Name){
        System.out.println("Object Created");
        this.name = Name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object Destryoed");
    }
}
