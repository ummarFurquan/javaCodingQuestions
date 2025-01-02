package StaticKeyword;
public class Main {
    public static void  main(String[] args) {
        /*
        * If you remove the static keyword from the main method in Java, your program will not run successfully.
        * Here's what happens and why:
        here The static keyword allows the JVM to invoke the main method without
        creating an object of the class.
         */

        Human randomename   = new Human(34, "randome", 15000, false);
        Human otherRandom   = new Human(21, "Other Random", 1500000, true);



        System.out.println(randomename.population);
        //Do not access it using the object name(randomename). It will work normally but it is not a set practice

        System.out.println(Human.population);
        // do not access  the static variable via the object name do it via the reference variable(Human).


        //Even if no objects are created you can still access the static instance variables.


        Main funn = new Main();
        funn.sample3();


    }


    static void sample(){
        Main obj  = new Main();
        obj.sample2(); // but after creating an object and then assigning that non static function to obj will not lead to an error

//        sample2(); // As we can see here. sample2 is not static. This will give error

    }

    void sample3(){
        sample2(); // here you can invoke that method which is non- static  because sample3 is also non static
    }

    // anything which is non static cannot be accessed in something which is static
    void sample2(){
        System.out.println("this is sample 2");
    }
}
