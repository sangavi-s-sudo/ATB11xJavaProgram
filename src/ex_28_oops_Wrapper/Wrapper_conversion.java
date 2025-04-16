package ex_28_oops_Wrapper;

// In Java, wrapper classes are used to wrap primitive data types (like int, char, boolean, etc.) into objects


public class Wrapper_conversion {
    public static void main(String[] args) {
        // Primitive to Wrapper (Boxing)
        int b = 10;
        Integer a = b; // this is called as boxing -> Automatically JVM will store the value of Primitive to wrapper (ALso called as AutoBoxing)
        System.out.println(a);
        System.out.println(a.byteValue()); // it will now also have behaviors



// Wrapper to Primitive (Unboxing)
    Integer c = 80;
    int d = c; // //This is called as  Unboxing -> wrapper is removed, attribute, behaviour is lost.
        System.out.println(d);
    }
}
