package ex_31_oops_Collection_Framework.Set;

import java.util.LinkedHashSet;

public class ex_04_linkedHashSetExample {
    public static void main(String[] args) {
        // Create a LinkedHashSet of String type
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // Adding elements (notice the order will be preserved)
        set.add("Re");
        set.add("Do");
        set.add("Fa");
        set.add("Sol");
        set.add("La");
        set.add("Ti");
        set.add("Mi");
        set.add("Sol");  // Duplicate - will be ignored

        System.out.println("LinkedHashSet: " + set);

        // Demonstrating order preservation compared to HashSet
        System.out.println("\nComparing order preservation:");

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(7);
        linkedHashSet.add(3);
        linkedHashSet.add(5);
        linkedHashSet.add(65536);
        linkedHashSet.add(9);

        System.out.println("LinkedHashSet: " + linkedHashSet);
    }
}