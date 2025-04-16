package ex_29_oops_Exceptions;

public class No_10_try_catch_finally {
    public static void main(String[] args) {
        int a= 1;
        int c = 0;
        try {
            int d = 10/0; // or int d = 10/2;-------> The Finally code block will execute if  try block  doesn't have vulnerable code also
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I will always be executed");
        }

    }
}
