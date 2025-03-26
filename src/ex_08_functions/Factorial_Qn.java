package ex_08_functions;

import java.util.Scanner;

public class Factorial_Qn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = scanner.nextInt();
        int factorial = 1;

        if (a <= 0 ){
            factorial = 1;
        }
        else{
//            for ( int i = 1; i <= a; i ++ ){
//                factorial = factorial * i;
//
//            }
            int i = 1;
            while (i <= a){
                factorial = factorial * i;
                i++;
            }
        }
        System.out.println("The factorial of "+ a + " is "+ factorial);
    }
}
