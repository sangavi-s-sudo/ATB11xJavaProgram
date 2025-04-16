package ex_31_oops_Collection_Framework.List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ex_08_Vector {
    public static void main(String[] args) {
        Vector v = new Vector(10); // here we can add initialCapacity

        v.add("Pramod");
        v.add("Amit");
        v.add("Lucky");
        System.out.println(v);
        v.remove("Amit");
        System.out.println(v.contains("Lucky"));
        System.out.println(v);

        //How can we print the elements of Vector?
        System.out.println(" ---- Normal For Loop ");

        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }

        System.out.println(" ---- For Each Loop ");

        for (Object o : v) { // object is declared becoz it can contains different data types
            System.out.println(o);
        }

        System.out.println(" ---- Iterator ");
        Iterator iterator = v.iterator();  //Don't need to instantiate the iterator becoz the vector itself contains iterator
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(" ---- Enumeration ");

        Enumeration< Object > enumeration = v.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        System.out.println(" ---- ListIterator ");
        ListIterator listIterator = v.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println(" ---- prints in backward direction ");
        while (listIterator.hasPrevious()) {  //Advantage of  The list iterator -> can do reverse of array also.
            System.out.println(listIterator.hasPrevious());
        }

    }

    //By using these methods we can print these elements
    // here iterator is the most popular method


}
