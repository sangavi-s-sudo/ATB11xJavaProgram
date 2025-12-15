package ex_09_Strings;

import java.util.Arrays;

public class String_qn2 {
    public static void main(String[] args) {


        String s1 = "Hello";
        String s4 = "Hello"; // SCP -> 1

        String s2 = new String("Hello"); // OA
        String s3 = new String("Hello");
        String s5 = new String("hello"); //  OA = 3

        Arrays.deepEquals(new String[]{s1, s2, s3, s4, s5}, new String[]{"Hello", "Hello", "Hello", "Hello", "hello"});
        Arrays.equals(new String[]{s1, s2, s3, s4, s5}, new String[]{"Hello", "Hello", "Hello", "Hello", "hello"});
        // == -> Comparsion -> String -> this check the locations ref.
        System.out.println(s1 == s3);
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);

        System.out.println("-------");
        System.out.println(s1 == s4);
        System.out.println(s3 == s5);
        System.out.println("+++++++");
        // equals ( content) -> value

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s5));
        System.out.println(s3.equalsIgnoreCase(s5));

        //  equalsIgnoreCase -> pramod. Pramod, PRAMOD , PraMod . PramoD -> pramod
        //  == - check for the ref
        // = assignment the value

    }
}
