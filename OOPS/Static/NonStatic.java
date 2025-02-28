package OOPS.Static;

public class NonStatic {
    //This is an Example to show that Non - Static Methods cannot be accessed in a method which is static
    public static void main(String[] args) { // here the main method is static
                //Non Static Method
        //      greeting(); // Throws an error Because greeting is non - static in nature
        // * Because something which is non - static belongs to an object  and needs an instance




        //Static method
        staticGreeting(); //This can be accessed because the method staticGreeting is Static in nature

    }
    void greeting(){

        // * This belongs to an object and needs to have an instance
        System.out.println("This is non Static in Nature");

        //But the method staticGreeting can be accessed here
        staticGreeting();

    }

    static  void staticGreeting(){
        // * This doesn't belongs to an object and neither an instance
        System.out.println("This method is static in nature");


        // **** But there is a way to access methods that are non static in methods which are static

        //You cannot access non static stuff in a static method unless and until you are  referencing their instances in a static context

        //Referecing their instances in a static context


        NonStatic obj = new NonStatic();
        obj.greeting();

    }

//You cannot access something which is non - static in something which is static but the vice versa is possible
}
