package Tasks;

import java.util.*;

public class Task_28_remove_duplicates_list {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "orange", "apple"));
        Set<String> set = new HashSet<>(list);
        System.out.println(list);
        list.clear();
        list.addAll(set);

        System.out.println("List without duplicates: " + list);

}
}
