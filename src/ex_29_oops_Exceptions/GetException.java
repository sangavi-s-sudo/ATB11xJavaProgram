package ex_29_oops_Exceptions;

public class GetException {
    public static void main(String[] args) {

        int a = 10;

        String input_user = args[0];// ArrayIndexOutOfBoundsException --> if we don't pass inputs in arguments
        int c = Integer.parseInt(input_user); // java.lang.NumberFormatException: For input string
        int out = a/c; // java.lang.ArithmeticException: / by zero
        System.out.println(out);
    }
}

// In this normal program we have three exceptions