package Tasks;

import java.util.HashSet;
import java.util.Set;

public class Task_27_duplicates_in_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};

        Set<Integer> seen = new HashSet<>();
        boolean duplicate = false;

        for (int num : arr) {
            if (!seen.add(num)) {
                duplicate = true;
                System.out.println(num);
            }
        }
        System.out.println(duplicate);
        System.out.println(seen);
    }
}
