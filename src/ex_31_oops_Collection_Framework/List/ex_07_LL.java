package ex_31_oops_Collection_Framework.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ex_07_LL {
    public static void main(String[] args) {
        List list = new ArrayList(5); // we can initiate the initialCapacity
        List mylist0 = new ArrayList(); // // Arrays Format - Continuously stored
        // ArrayList allows and store null and duplicates values.


        List mylist2 = new LinkedList(); // Doubly Linked List. --> Stored anywhere
        mylist2.add("Pramod");// can store any data types , duplicates , null values
        mylist2.add("Dutta");
        mylist2.add("Amit");
        mylist2.add("meenu");
        mylist2.add("ritwik");
        mylist2.add("ritwik");
        mylist2.add(null);
        mylist2.add(true);
        mylist2.add(123);
        System.out.println(mylist2);

        System.out.println(mylist2.isEmpty());
        System.out.println(mylist2.size());
        System.out.println(mylist2.contains("Dutta"));
        System.out.println(mylist2.indexOf("Dutta"));


        //The main difference between ArrayList and LinkedList is how we add the elements
    }
}
