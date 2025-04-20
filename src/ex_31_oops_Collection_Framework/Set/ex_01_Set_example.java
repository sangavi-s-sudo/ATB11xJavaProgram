package ex_31_oops_Collection_Framework.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ex_01_Set_example {
    public static void main(String[] args) {
        Set hs = new HashSet();
        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();


        hs.add("Sangavi");
        hs.add("Sangavi");
        System.out.println(hs); // only one "Sangavi" will be printed - no duplicates are allowed
    }
}
