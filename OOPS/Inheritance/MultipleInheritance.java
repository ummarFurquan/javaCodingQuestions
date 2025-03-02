package OOPS.Inheritance;

public class MultipleInheritance {
    public static void main(String[] args) {
//        Class3 obj1 = new Class3(34);
//        System.out.println(obj1.a);
    }
}

class Class1{
    void Show(){
        System.out.println("Class 1");
    }

}

class Class2 extends Class1{
    void show(){
        System.out.println("Class 2");
    }
}

//class Class3 extends Class1, Class2{ // Cannot be done as Java Doesn't allows multiple inheritance
//
//    Class3(double a) {
//        super(a);
//    }
//}
