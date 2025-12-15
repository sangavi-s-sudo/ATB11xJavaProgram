package ex_29_oops_Exceptions;

public class No_7_try_Catch_or {
    public static void main(String[] args) {
        try{

            int a = 10/0;

        } catch (ArithmeticException | NullPointerException e){
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("common one");
        }
    }
}

// if we get multiple exceptions we can use (|)