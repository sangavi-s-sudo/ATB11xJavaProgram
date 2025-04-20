package ex_31_oops_Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class ex_03_ArrayListConcept2 {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add("paramod");
        l.add(2);
        l.add(null);
        System.out.println(l);
        System.out.println(l.size());


        List l1 = new ArrayList(); // Dynamic Dispatch
        l1.add("123");
        l1.add("456");
        l1.add(123);
        System.out.println(l1);
        System.out.println(l1.isEmpty());

        List l2 = new ArrayList();
        System.out.println(l2.isEmpty());


    }
}
