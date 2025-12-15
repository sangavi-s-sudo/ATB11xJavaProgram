package Tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task_23_merge_sort_two_arrays {
    public static void main(String[] args) {
        int[] a = {3,1,5,0};
        int[] b = {7,4,17,2,11};

        List list = new ArrayList<>();

        for (int i : a){
            list.add(i);
        }

        for(int j : b){
            list.add(j);
        }

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);
        System.out.println(list.toArray().length );
        System.out.println( list.get(list.toArray().length -2 ));



    }
}
