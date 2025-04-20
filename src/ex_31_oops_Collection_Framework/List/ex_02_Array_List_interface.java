package ex_31_oops_Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class ex_02_Array_List_interface {
    public static void main(String[] args) {
        // List fruits = new List(); As List is interface , so cannot be create objects
        List fruits = List.of("apple", "orange","banana","mango","watermelon");//--> it is static becoz we can call without creating objects
        //List.of(...) is a Java 9 feature that creates an immutable list. ---> Immutable means you cannot modify it — no add, remove, or update operations.
        System.out.println(fruits);
        //fruits.add("chikku");// UnsupportedOperationException --> Becoz static method doesn't support add or update or remove operations
        // so for that we have to use ArraYList which is subclass under List .


        List<Integer> l2 = new ArrayList();
        l2.add(3);
        // l2.add("ABC"); --> cannot support other datatypes if we mention data types while instantiating.

       // If we don't restrict data types, it will support all data types
        List l = new ArrayList(); // Dynamic Diapatch
        l.add("hello");
        l.add("123");
        l.add(null);
        l.add('t');
        System.out.println(l);

        //

    }
}