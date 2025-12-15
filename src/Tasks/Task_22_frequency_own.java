package Tasks;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task_22_frequency_own {
    public static void main(String[] args) {
        String input = "My name is Sangavi";
         Map<Character,Integer> vowelsMap = new LinkedHashMap<>();


         String vowels = "aeiou";

         for (int i =0; i<input.length();i++){
             Character ch = Character.toLowerCase(input.charAt(i));
             if(vowels.contains(String.valueOf((ch)))){
                 if(vowelsMap.containsKey(ch)){
                    vowelsMap.put(ch,vowelsMap.get(ch)+1);}
                 else{
                     vowelsMap.put(ch,1);
                 }
                 }
             }
        System.out.println(vowelsMap);

    }
    }

