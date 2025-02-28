package OOPS.Static;

public class Main {
    public static void main(String[] args) {
        Human harry = new Human(22, "Harry Code", 5.6f, 250000);
        Human john = new Human(34, "John Doe", 6f, 2500);


        //For thr properties that are static You can also access the population property (Which is Static Here) using objectname.property
        //But It's better to go with className.property
        System.out.println(Human.population); // 2 (Refer Human.java for detailed explanation
        System.out.println(Human.population); // 2
    }
}
