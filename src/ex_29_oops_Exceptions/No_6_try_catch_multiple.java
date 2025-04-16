package ex_29_oops_Exceptions;

public class No_6_try_catch_multiple {
    public static void main(String[] args) {
        System.out.println("1");
        try{
            int a = 10/0;
        } catch (Exception e) {
            System.out.println("BIgger exception first");
        }
//        } catch (ArithmeticException e){
//            System.out.println("smaller exception");
//        } // this is not possible (wrong) becoz bigger exception is used before.
    }
}
// firse we should use smaller exception then the bigger one