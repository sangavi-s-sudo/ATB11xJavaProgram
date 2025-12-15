package Tasks;

import java.util.Arrays;

public class Task_20_anagram {
    public static void main(String[] args) {

        String str1 = "lbsten";
        String str2 = "sblent";

        if(str1.length() == str2.length()) {
            checkAnagram(str1, str2);
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }

    public static void checkAnagram(String str1, String str2) {

        char[] Arr1 = str1.toCharArray();
        char[] Arr2 = str2.toCharArray();
        System.out.println(Arr1);

        Arrays.sort(Arr1);

        Arrays.sort(Arr2);

        if(Arrays.equals(Arr1,Arr2)){
            System.out.println("The strings are  anagrams.");
        }
        else{
            System.out.println("The strings are not anagrams.");
        }

    }


}



