package ex_31_oops_Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class ex_02_Array_List_interface {
    public static void main(String[] args) {

        List l = new ArrayList(); // Dynamic Diapatch
        l.add("hello");
        l.add("123");
        l.add(null);
        l.add('t');
        l.add(90);

        System.out.println(l);

        //

    }
}