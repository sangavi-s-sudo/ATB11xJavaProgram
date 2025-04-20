package ex_31_oops_Collection_Framework.Map;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class ex_05_HashTable {
    public static void main(String[] args) {
        // In map basically allows null values


        // Hashtable - Synchronised, Slow and Legacy Class - Thread Safe
        // HashTable - Dont allow null values
        // T1, T2 - they will use one by one.


        Hashtable<Integer,String> ht1 = new Hashtable();
        ht1.put(1, "one");
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");
//        ht1.put(4, null); // java.lang.NullPointerException
//        ht1.put(null, "three");  // java.lang.NullPointerException

        // it wont allow both key, value for null value.
        // duplicates allowed but will be replaced

        System.out.println(ht1);


        // we can iterate through the HashTable using enumeration
        Enumeration<Integer> e  = ht1.keys();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());

        }


        HashMap<Integer,String> ht2 = new HashMap<>();
        // Not Thread Safe, or Not Synchronised
        // both null values and keys are allowed
        // duplicates allowed and replaced

        ht2.put(1, "one");
        ht2.put(2, "two");
        ht2.put(3, "three");
        ht2.put(3, null);
        ht2.put(null, null);
        System.out.println(ht2);

    }
}
