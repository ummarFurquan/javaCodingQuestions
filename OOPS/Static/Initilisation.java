package OOPS.Static;

public class Initilisation {
    static int a = 4;
    static int b;

    static {
        System.out.println("Static Block"); // This Runs Only Once Even if you create a new Object which we did in line 19
        b = a * 5;
    }

    public static void main(String[] args) {
        Initilisation obj = new Initilisation();
        System.out.println(obj.a + " " + obj.b);

        obj.b += 3;
        System.out.println(obj.a + " " + obj.b);

        Initilisation obj1 = new Initilisation();
        System.out.println(obj1.a + " " + obj1.b);
    }
}
