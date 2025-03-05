package OOPS.AccessControl;

public class A {

    // To understand better about access modifiers
    private int privateInt;
     public int publicInt;
    int defaultInt;
    int protectedInt;



    public A(int privateInt, int publicInt, int defaultInt, int protectedInt) {
        this.privateInt = privateInt;
        this.publicInt = publicInt;
        this.defaultInt = defaultInt;
        this.protectedInt = protectedInt;
    }
    //Private Can be accessed only in this Class A
    // But Can be Accessed only by getters and setters if those are public methods


    public int getPrivateInt() {
        return privateInt;
    }

    public void setPrivateInt(int privateInt) {
        this.privateInt = privateInt;
    }
}
