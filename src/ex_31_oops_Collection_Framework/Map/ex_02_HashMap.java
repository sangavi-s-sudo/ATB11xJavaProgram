package ex_31_oops_Collection_Framework.Map;

import java.util.HashMap;
import java.util.Map;

public class ex_02_HashMap {
    public static void main(String[] args) {
        Map map = new HashMap();
        HashMap m1 = new HashMap();
        map.put("id",1);
        map.put("id",2); // latest value of duplicates will be outputted
        map.put("id2",2);
        map.put("id3",34);// we will allow duplicate value and not allow duplicate keys
        map.put("id6",34);
        map.put("id4",null);// null values might be duplicate
        map.put("id5",null);
        map.put(null,102);
        map.put(null,103);// only one null keys are allowed
        System.out.println(map);


        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("id6"));

        System.out.println(map.containsValue("34"));
        System.out.println(map.keySet());  // prints all the keys
        System.out.println(map.values()); // prints all the values

        System.out.println(map.get("id3"));


    }
}
