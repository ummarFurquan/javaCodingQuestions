package OOPS.AccessControl;

public class Main {
//  A class is in the same package
    //To understand the behaviour in different package and subClass and nosubclass
    //refer Code in DemoClass.java/ADemoPackage
    public static void main(String[] args) {
        A newObj1 = new A(34,45,67,89);


        //Private Reference Variable can be only accessed inside the class in which they are Created
        //I cannot Access The Private int directly
//        int n = newObj1.PrivateInt; // This will throw error
        //But can be done via getter and setter created
        newObj1.getPrivateInt();
        newObj1.setPrivateInt(34);


        //Default Modifier ( Not specified)
        //Can be Accssed Inside the Class in which they are created and within Package
        System.out.println(newObj1.defaultInt); // 67



        //Public Reference Variables
        System.out.println(newObj1.publicInt); // 45
        //
    }
}
