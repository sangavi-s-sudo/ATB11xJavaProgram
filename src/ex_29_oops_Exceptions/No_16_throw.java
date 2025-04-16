package ex_29_oops_Exceptions;

import java.util.Scanner;

public class No_16_throw {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no");
        int a = sc.nextInt();
        try {
            int b = 10 / a;
            System.out.println(b);
        } catch (Exception e) {
            divideByZero(a);
        } finally {
            sc.close();
        }
    }

    static void divideByZero(int a) {
        // check some
        if (a == 0) {
            throw new ArithmeticException(("Can't divide by Zero"));
        }
    }
}
