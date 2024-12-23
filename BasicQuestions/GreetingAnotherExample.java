package BasicQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class GreetingAnotherExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        String greeting  = greet(name);
        System.out.println(greeting);


    }
static String greet(String name) {
        String res = "Hello" + name;
        return res;
}

    public static class ArrayLists {
        public static void main(String[] args) {
         ArrayList<Integer> list  = new ArrayList<>();
            Scanner in = new Scanner(System.in);

            for(int i = 0; i < 10; i++){
                list.add(in.nextInt());
            }

            for(int j = 0; j < 10; j++){
                System.out.print(list.get(j) + " ");
            }
        }
    }
}
