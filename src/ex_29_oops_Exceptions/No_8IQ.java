package ex_29_oops_Exceptions;

public class No_8IQ {
    public static void main(String[] args) {
        try{
            String input_user = args[0];
            int a = Integer.parseInt(input_user);
            int out = 10/a;
            String b = null;
            b.trim();
        } catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

}
