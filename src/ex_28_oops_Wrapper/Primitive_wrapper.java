package ex_28_oops_Wrapper;
// from now on we don't use primitive data types , we use only wrapper classes
public class Primitive_wrapper {
    public static void main(String[] args) {
        int a = 10; // primitive
        // This is not Object
        // It will not have attribute or Behaviour

        // char, short, byte, long, float, double, - we will avoid them now


        // In collection framework , We will use the Wrapper classes,
        // Character, Boolean, Short, Long, Double, Float

        Integer age = 65;
        System.out.println(Integer.hashCode(5));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(age);
        System.out.println(age.intValue());
    }
}
