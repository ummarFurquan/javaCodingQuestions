package Arrays;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ContainsDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,4,4,4};
        System.out.println(duplicate(arr));

    }

    static int duplicate(int[] arr){
        Set<Integer> s = new HashSet<>();

        for(int i : arr){
            s.add(i);
        }

        // this is 1 way to print
        for(int values : s){
            System.out.print(values + " "); // 1 2 3 4 {Duplicates are removed}

        }
        System.out.println();

        // This is another way to print the elements
        Iterator it = s.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();
        return s.size(); // removes the duplicates and return 4  2
    }
}
