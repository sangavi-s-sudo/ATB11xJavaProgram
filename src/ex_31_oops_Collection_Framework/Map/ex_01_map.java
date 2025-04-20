package ex_31_oops_Collection_Framework.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ex_01_map {
    public static void main(String[] args) {
        // map is mostly used in json
        // json is a key value pair which is used to transfer datas from client to server

        Map m1 = new HashMap();
        // map stores key value pairs


        m1.put("name","sangavi");
        m1.put("age",12);
        m1.put("phoneNo", 123456789);
        System.out.println(m1);
        // as we are using hashmap, values will be in random order

        Map m2 = new LinkedHashMap();
        m2.put("name","sangavi");
        m2.put("ages",12);
        m2.put("phoneNo", 123456789);
        System.out.println(m2);

        //LinkedHashMap(); // it will be in order of user input
        // HashMap(); // it will be in random order
        // treeMap() --> Natural sorting based on  keys

        Map m3= new TreeMap();
        m3.put("name","sangavi");
        m3.put("ages1",12);
        m3.put("ages",12);
        m3.put("phoneNo", 123456789);
        m3.put("jug", "vwhd");

        System.out.println(m3);
    }
}
