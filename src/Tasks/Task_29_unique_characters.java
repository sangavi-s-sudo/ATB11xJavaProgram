package Tasks;

import java.util.*;

public class Task_29_unique_characters {
    public static void main(String[] args) {
        String str = "hello";

        Set unique = new LinkedHashSet<>();

        for(int i = 0; i<str.length();i++){

            if(!unique.add(str.charAt(i))){
                System.out.println(str.charAt(i));
            }
        }
        System.out.println(unique);
    }
}
