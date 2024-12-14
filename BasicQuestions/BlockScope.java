package BasicQuestions;

public class BlockScope {
    public static void main(String[] args) {
        int a = 100;
        {
//            int a = 20; //Already intialized in this scope / block / method
            a = 20; // but you can change the value only in the same block / method / scope
            System.out.println(a); // output 20;
            int c = 100;// this c can be used only in this 1. scope
        }
            // 1.
        int c = 200;//gives error // but this throws an error
        System.out.println("c is"+ c); // c is 200
//        int c = 300; // doesnt give error becuase C is initialized in the above scope that remains to that particular scope

//        System.out.println(c); // values assigned in that particular block will remain in that particular block and cannot be accessed outside the block.
        System.out.println(a); // output 20 because the value is changed;
        //you can modify the value of any variable and the changes are automatically reflected in the variable irrespective of its scope

    }

    static void AnotherScope(){
        // here we can reinitialize "a" again if we want
        int a = 300;
        //This is a diffrent scope

    }

    //Same goes for string as well
}
