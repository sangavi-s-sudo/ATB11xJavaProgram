package ex_31_oops_Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class ex_04_ArrayListConcept3 {
    public static void main(String[] args) {
       // List list = new ArrayList(10);// we can define by using initialCapacity also
        List list = new ArrayList(4);

        // Initial capacity just sets the starting size of internal array.
// It does NOT limit how many elements can be added.
// ArrayList will grow automatically when more elements are added.(internally happens)

        list.add(1);
        list.add("see");
        list.add("4");
        list.add(true);
        list.add("3");
        list.add("3");
        List list2 = new ArrayList(4);

        list2.add(3);
        list.add("see");
        list.add("4");
        list.add(true);

        System.out.println(list.size());
        System.out.println(list.add(3));
        System.out.println("++++++++++++++++");
        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.contains("4"));
        System.out.println(list.contains(4));
        // Returns the index of the first occurrence of the specified element in this list,
        System.out.println(list.indexOf("3"));
        System.out.println("EEUDTFGH"+ list.equals(list2));

        System.out.println(list.lastIndexOf("3"));
        System.out.println(list);


        for(int i = 0 ; i<list.size();i ++){
            System.out.println(list.get(i));
        }

        list.clear();
        System.out.println(list);
    }
}
