package OOPS.ADemoPackage;

import OOPS.AccessControl.A;

public class DemoClas extends A{

    public DemoClas(int privateInt, int publicInt, int defaultInt, int protectedInt) {
        super(privateInt, publicInt, defaultInt, protectedInt);
    }

    public static void main(String[] args) {
        A onj3= new A(45,65,23,100);

        //The public reference Variable can be accessed here in different package and subclass
        System.out.println(onj3.publicInt);
    }
}

