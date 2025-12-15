package Tasks;

import java.util.*;

public class Task_26_intersection_of_two_list {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 8));
        List<Integer> intersection = findIntersection(list1, list2);
        System.out.println("Intersection: " + intersection);
    }

    public static List<Integer> findIntersection(List<Integer> list1, List<Integer> list2) {
        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);
        System.out.println(set1);
        System.out.println(set2);
        set1.addAll(set2);
        System.out.println("hey");
        System.out.println(set1);

        return new ArrayList<>(set1);
    }

}

