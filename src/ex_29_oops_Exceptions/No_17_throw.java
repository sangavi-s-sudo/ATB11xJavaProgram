package ex_29_oops_Exceptions;
// The throw statement allows you to create a custom error.
// Throw an exception if age is below 18 (print "Access denied"). If age is 18 or older, print "Access granted":
public class No_17_throw {
    public static void main(String[] args) throws ArithmeticException{
        checkAge(12);
    }

    private static void checkAge(int age) {
        if (age < 18){
            throw new ArithmeticException("You can't go");
        }
        else {
            System.out.println("please go to college");
        }
    }
}
