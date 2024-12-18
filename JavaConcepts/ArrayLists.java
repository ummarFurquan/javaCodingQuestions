package JavaConcepts;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
     ArrayList<Integer> list  = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        for(int i = 0; i <= 10; i++){
            list.add(in.nextInt());
        }

        for(int j = 0; j <=10; j++){
            System.out.print(list.get(j) + " ");
        }
    }
}
