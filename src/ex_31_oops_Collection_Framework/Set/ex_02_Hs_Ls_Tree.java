package ex_31_oops_Collection_Framework.Set;

import java.util.*;

public class ex_02_Hs_Ls_Tree {
    public static void main(String[] args) {
        Set<String> hs = new HashSet(); // Generics concept -> only need String data types
        // Here we use Hashing mechanism to store the element
        // random order.
        // no duplicates

        hs.add("Apple");
        hs.add("Orange");
        hs.add("WaterMelon");
        hs.add("WaterMelon");

        System.out.println(hs);  // Totaly 3 elements as no duplicates ("WaterMelon") allowed

        // hs.add(123); // Only allows String data type
        System.out.println("---------------------");
        hs.add(null);
        hs.add(null); // only one null is allowed in SET
        System.out.println(hs.contains("Apple"));
        System.out.println("---------------------");
        System.out.println(hs);


        for(String s : hs){
            System.out.println(s);
        }
        System.out.println("---------------------");

        Iterator iterator = hs.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("---------------------");

        Set lhs = new LinkedHashSet();
        // LinkedList mechanism to store the element,
        // order will maintain, no duplicates
        lhs.add("Dpple");
        lhs.add("apple");
        lhs.add("Orange");
        lhs.add("WaterMelon");
        lhs.add("WaterMelon");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());


        System.out.println(" ---------------------------");
        Set ts = new TreeSet();
        // Black and Red Tree mechanism to store the element.
        // order will maintain, Natural Sorting is done.
        // Natural Sorting - ASCII values.
         // natural sorting means first character sorting
        ts.add("Dapple");
        ts.add("Apple");
        ts.add("apple");
        ts.add("Orange");
        ts.add("WaterMelon");

        //ts.add("");  -> it will come first in list
//        ts.add(123);  // java.lang.ClassCastException -> we can't sort if we have null and integers
//        ts.add(null); // java.lang.NullPointerException
        System.out.println(ts);

        System.out.println(" ----- For Each ---- ");

        for(Object o:ts){
            System.out.println(o);
        }
    }
}
