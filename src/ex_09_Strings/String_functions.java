package ex_09_Strings;

public class String_functions {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println(c);

        String s1 = "ABCD";
        System.out.println(s1.length());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.concat("E"));
        System.out.println(s1);


        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
    }
}
