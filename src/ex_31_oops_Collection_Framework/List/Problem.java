package ex_31_oops_Collection_Framework.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class Problem {
    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "misten";


        if (str1.length()== str2.length()){
            checkAnagram1(str1, str2);
        }
        else{
            System.out.println("It is not a anagram");
        }
    }
    public static void checkAnagram1(String str1, String str2) {

       char[] a = str1.toCharArray();
       char[] b = str2.toCharArray();

       Arrays.sort(a);
       Arrays.sort(b);

       if (Arrays.equals(a,b)){
           System.out.println("Yay!! It is a anagram");
       }
       else {
           System.out.println("It is not a anagram!!!");
       }


    }

}