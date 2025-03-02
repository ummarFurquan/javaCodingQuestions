package OOPS.Polymorphism.Example3;

public class MethodOverriding {

     static class Parent{
        void message(){
            System.out.println("parent Class");
        }
    }
    static class Child extends Parent{
        @Override
         void message(){
            System.out.println("Child Class");
        }
//        @Override // This gives an error becuase there is not method in the superclass known as show()
//        void show(){
//            System.out.println("Show");
//        }
    }

    public static void main(String[] args) {
        Parent obj = new Child(); //Upcasting
        Child obj3 = new Child(); //This is obviously allowed
//        Child obj4 = new Parent(); // This is an example of downcasting
        obj.message(); //Child Class message() method


    }



    /*
    * Why does this happen? (Runtime Polymorphism)
    The reference obj3 is of type Parent, but the actual object is Child.
    At runtime, Java looks at the actual object type (Child) and calls Child's show() method, instead of Parent’s.
    This is called dynamic method dispatch or method overriding.
*/
}
