package ex_29_oops_Exceptions;

public class No_5_try_catch_specific_exception {
    public static void main(String[] args) {
        int a = 0;
// Try catch with multiple blocks
        try{
           int b = 10/0;
        }
        catch (ArithmeticException e) {
            System.out.println("Passed specific exception");
        }
        catch (Exception e){ // here if it is not ArithmeticException then it will catch other exception
            System.out.println("catch common exception");
        }
    }
}
// if we know what exception we throw then we can add that specific one in catch block else add common one
// It ia always advised to use the specific exception