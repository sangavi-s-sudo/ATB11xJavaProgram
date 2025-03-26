package ex_09_Strings;

public class String_functions2 {
    public static void main(String[] args) {
        String name = "Sangavi";
        System.out.println(name.length());
        System.out.println(name.charAt(4));
        // System.out.println(name.charAt(7)); // will throw java.lang.StringIndexOutOfBoundsException

        //concat
        System.out.println(name.concat(" Naveen"));

        //equals
        System.out.println(name.equals("hi"));
        System.out.println(name.equals("Sangavi"));
        System.out.println(name.equals("sangavi")); // strings are case sensitive

        // equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("saNgaVi"));
        System.out.println(name.equalsIgnoreCase("saNgaViS"));

        // indexOf() //  Sangavi ->  g is in which index ?
        System.out.println(name.indexOf("ng"));
        System.out.println(name.indexOf("n1")); // gives -1
        System.out.println(name.indexOf("a")); // returns the value of first index

        System.out.println(name.replace('a', 'p'));

        String name4 = "pramod@live.com@123";
        String[] split = name4.split("@");
        // System.out.println(split); --> wrong implementation
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);


        // substring( , )
        System.out.println(name.substring(1,3));
        System.out.println(name.substring(1,7));

        //toLowerCase()
        System.out.println("SONAL".toLowerCase());

        // 12. toUpperCase()
        System.out.println("sonal".toUpperCase());

        // 14. startsWith()
        System.out.println(name.startsWith("S"));

        // 15. endsWith()
        System.out.println(name.endsWith("a"));

        // trim()
        String s33 = "          AEIOU        ";
        System.out.println(s33.trim());

        //compareTo()
        System.out.println(name.compareTo("IUO"));

        StringBuilder stringBuilder = new StringBuilder("hi");
        System.out.println(stringBuilder);

        StringBuilder sb = new StringBuilder("Sangavi");
        System.out.println(sb);

        String anotherPalindrome = "Niagara. O roar again!";
        String roar = anotherPalindrome.substring(11, 15);
        System.out.println(roar);

        String n = "PRamoddUTTA";
        System.out.println(n.indexOf("d"));
        System.out.println(n.lastIndexOf("d"));
        System.out.println(n.lastIndexOf("s"));
    }
}
