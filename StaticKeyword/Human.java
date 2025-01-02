package StaticKeyword;

public class Human{
    int age;
    String name;
    int Salary;
    boolean married;
    static long population; // Properties that are not related to the object are known as static instance variable and method



    public Human(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.Salary = salary;
        this.married = married;
        this.population +=1;
    }
}
