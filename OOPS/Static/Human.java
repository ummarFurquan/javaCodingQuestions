package OOPS.Static;

public class Human {
    int age;
    String name;
    float height;
    int salary;
    static long population;

    //Non Static, This gives an outpit of 1
//    long population;



    public Human(int age, String name, float height, int salary) {
        this.age = age;
        this.name = name;
        this.height = height;
        this.salary = salary;
        Human.population += 1; // Can also be written as this.population += 1, This gives an Ouput as 2(Increase when more number of objects are created!;
    }


}
