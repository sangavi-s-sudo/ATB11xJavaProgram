package ex_29_oops_Exceptions;

public class No3_Null_pointer {
    public static void main(String[] args) {
        String a = null;
        a.trim(); //NullPointerException: Cannot invoke "String.trim()" because "a" is null
    }
}
