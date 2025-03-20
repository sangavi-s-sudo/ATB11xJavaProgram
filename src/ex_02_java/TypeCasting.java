package ex_02_java;

public class TypeCasting {
    public static void main(String[] args) {
        byte b = 23;
        int a  = b; // implicit widening -- Valid syntax -> smaller data into the bigger data type
        int a1 = (int)b; // explicit widening (not needed understood by JVM)
        System.out.println(a);
        System.out.println(a1);


        long l = 921345677854L;
        // short s = l; ----- implicit narrowing gives compilaton error
        short s1 = (short)l;
        System.out.println(s1); // --explicit narrowing leads to data loss

    }
}
