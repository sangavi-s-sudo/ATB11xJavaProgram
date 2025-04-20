package ex_31_oops_Collection_Framework.Set;

import java.util.TreeSet;

public class ex_05_treeSet_example {
    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(2);
        numbers.add(5);
        numbers.add(4);
        numbers.add(6);

        System.out.println("TreeSet: " + numbers);


    }
}
