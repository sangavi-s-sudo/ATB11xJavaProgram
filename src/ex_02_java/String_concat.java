package ex_02_java;

public class String_concat {
    public static void main(String[] args) {
        String first_name = "Sangavi";
        String last_name = "Naveen";

        int a = 10;
        int b = 10;

        System.out.println(first_name + last_name + a + b);
        // // SangaviNaveen1010 - first operator - + performed as Concatenation

        System.out.println(a + b + first_name + last_name);


        System.out.println(first_name + last_name + (a + b));

        // BODMAS - Bracket of Div, mul, add, sub
    }
}
