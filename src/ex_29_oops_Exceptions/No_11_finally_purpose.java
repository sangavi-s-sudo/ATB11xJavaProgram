package ex_29_oops_Exceptions;

import java.util.Scanner;

// what is the purpose of finally block
public class No_11_finally_purpose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number for division: ");
        int input = scanner.nextInt();

        try{
            int a = 10/input;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            scanner.close();
            System.out.println("Sc is closed");
        }
    }
}
// if try catch executes or not , JVM won't take care -> it will run Finally block always
// finally is optional --> try catch works without finally also
