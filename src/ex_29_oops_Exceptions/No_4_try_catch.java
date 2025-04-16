package ex_29_oops_Exceptions;

public class No_4_try_catch {
    public static void main(String[] args) {
        try{
            int a = 10/0;
            System.out.println(a);
        }
        catch(Exception e){
            System.out.println("Throws exception");
        }
    }
}
