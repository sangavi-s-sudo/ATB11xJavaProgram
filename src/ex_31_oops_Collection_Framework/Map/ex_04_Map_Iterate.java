package ex_31_oops_Collection_Framework.Map;

import java.util.HashMap;
import java.util.Map;

// how to traverse over the map
public class ex_04_Map_Iterate {
    public static void main(String[] args) {

        Map<String , Integer> map = new HashMap();
        map.put("id", 1);
        map.put("id2", 2);
        map.put("id3", 34);
        map.put("id4", null);
        map.put("id5", null);
        map.put(null, 100);


        for(Map.Entry<String,Integer> item: map.entrySet()){
            System.out.println(item.getKey() + " -> " +item.getValue());
        }
    }
}
//Step-by-Step Explanation
//1. map.entrySet()
//This gets all the key-value pairs from the map.
//
//It returns a Set of Map.Entry objects.
//
//Think of each Map.Entry as one pair like "id" -> 1.
//
//2. for (Map.Entry<String, Integer> item : ...)
//This is a for-each loop.
//
//It goes through each entry (each key-value pair) in the map.
//
//3. item.getKey() and item.getValue()
//item.getKey() gets the key (like "id").
//
//item.getValue() gets the value (like 1).
//
//4. System.out.println(...)
//This prints the key and value in this format: