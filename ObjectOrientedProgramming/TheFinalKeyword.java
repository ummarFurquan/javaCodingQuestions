package ObjectOrientedProgramming;

public class TheFinalKeyword {

    public static void main(String[] args) {

//    final A randome = new A("You name");
//    randome.yourName = "Other Name"; // this is allowed you can change the value;
//        randome A  = new A("other Other Name"); // this throws an error


        A obj;
                for(int i = 0; i < 1000000000; i ++){
                    obj = new A("Randome Name");
                }

    }
}


class A {
//    final int num  = 20;
//    String yourName;


    public A (String name){
        System.out.println("Object Created");
//        this.yourName = name;
    }

    @Override
    protected  void finalize() throws Throwable{
        System.out.println("Object Destroyed");
    }
}
