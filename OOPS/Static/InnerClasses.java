package OOPS.Static;


//class Test{ //  *** But having this class outside the InnerClass wont give error because this class Test is not Dependent on any other class
//    static String name;
//
//    public  Test(String name){
//        Test.name = name;
//    }
//
//}


public class InnerClasses { // This class Cannot be static
   static class Test{ //  *** Wtihout this class being static it gives an error because it cannot be referenced from a static context
        String name;

        public  Test(String name){
            this.name = name;
        }

       @Override // These are knwon as annotation
       public String toString() {
           return name; // this prints harry
       }
   }
    public static void main(String[] args) {

        //For the class which is static and inside the innerclass
        Test obj1 = new Test("harry");
        Test obj2 = new Test("Code");
        System.out.println(obj1.name); //harry
        System.out.println(obj2.name); //code


//        //For the class which is non static  and outside the innerclass
//        Test name1 = new Test("harry");
//        Test name2 = new Test("Code");
//        System.out.println(name1.name); // code
//        System.out.println(name2.name); //code



         //  *** Internal Working of some Statements
        //What if we print the value of obj1?

        System.out.println(obj1); //OOPS.Static.InnerClasses$Test@2f4d3709
        //println has a method valueOf which internally has a method to toString(), (CTRL + left click on println)
        // toString -> return getClass().getName() + "@" + Integer.toHexString(hashCode());
       //Java looks for a method (In this example toString is being searched) first inside if it is not present it looks inside the class, if it is not present there as well, it will

        //We can overRide this by creating our own method inside this class


    }
}
