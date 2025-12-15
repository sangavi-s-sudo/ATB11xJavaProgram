package Tasks;

import java.util.LinkedHashMap;
import java.util.Map;

public class non_repeating_char {
    public static void main(String[] args) {
        String input = "swiss";

        Map<Character, Integer> map = new LinkedHashMap<>();

        // Count frequencies
        for (char ch : input.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        // Find first character with count = 1
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeating char: " + entry.getKey());
                break;
            }
        }

        System.out.println("No non-repeating character found.");
    }
}
