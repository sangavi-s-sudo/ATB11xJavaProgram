package ex_31_oops_Collection_Framework.Map;

import java.util.*;

// we store students record using map
public class ex_03_REAL_EXAMPLE_MAP {
    public static void main(String[] args) {
        Map<String,Object> student1 = new HashMap();
        // Key will be String type
        // Value will be Object type.

        student1.put("name","Diwakar");
        student1.put("phone","9876543210");
        student1.put("address1","Bangalore");
        student1.put("address2",123);

        System.out.println(student1);


        Map<String,Object> student2 = new HashMap();
        student2.put("name","Lukcy");
        student2.put("phone","96789876");
        student2.put("address1","Delhi");
        student2.put("address2",345);
        System.out.println(student2);

        List students = new ArrayList();
        students.add(student1);
        students.add(student2);

        System.out.println(students);

        Set book_read_items = new HashSet();
        book_read_items.add("Rich dad Poor Dad");
        book_read_items.add("Sapaiens");
        book_read_items.add("Secret");
        book_read_items.add("Atomic Habit");
        book_read_items.add("Atomic Habit");
        book_read_items.add("Eat the Frog");

        System.out.println(book_read_items);



    }
}
