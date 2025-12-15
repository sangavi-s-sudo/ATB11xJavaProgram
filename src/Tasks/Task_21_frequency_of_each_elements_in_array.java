package Tasks;
import java.util.*;

public class Task_21_frequency_of_each_elements_in_array {
    public static void main(String[] args) {
        String input = "My name is sangavi gemipoyu";   // example
        System.out.println(findFrequency(input));
    }

    public static Map<Character, Integer> findFrequency(String str) {
        Map<Character, Integer> vowelFrequencyMap = new LinkedHashMap<>();
        String vowels = "aeiou";

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            System.out.println(String.valueOf(ch));

            if (vowels.contains(String.valueOf(ch))) {
                if (vowelFrequencyMap.containsKey(ch)) {
                    vowelFrequencyMap.put(ch, vowelFrequencyMap.get(ch) + 1);
                } else {
                    vowelFrequencyMap.put(ch, 1);
                }
            }
        }

        return vowelFrequencyMap;
    }

}





