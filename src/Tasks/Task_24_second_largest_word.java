package Tasks;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task_24_second_largest_word {
    public static void main(String[] args) {


        String input = "India is my country";

        Map<String, Integer> sl = new LinkedHashMap<>();

        String[] words = input.split(" ");


        for (int i = 0; i < words.length; i++) {
            sl.put(words[i], words[i].length());
        }
        System.out.println(sl);


        int firstLargest = 0, secondlargest = 0;


        for (Map.Entry<String, Integer> item : sl.entrySet()) {

            if (item.getValue() > firstLargest) {
                secondlargest = firstLargest;
                firstLargest = item.getValue();
            } else if (item.getValue() > secondlargest && item.getValue() != firstLargest) {
                secondlargest = item.getValue();
            }
        }
        System.out.println(secondlargest);

        for (Map.Entry<String, Integer> items : sl.entrySet()) {
               if( items.getValue()==secondlargest){
                   System.out.println(items.getKey() + " is the second largest word");
                   break;
               }
        }
    }
}
