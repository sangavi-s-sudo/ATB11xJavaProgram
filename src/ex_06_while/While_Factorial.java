package ex_06_while;

import java.util.Scanner;

public class While_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number: ");
        int number = scanner.nextInt();

        int factorial = 1;
        if (number <= 0) {
            System.out.println("Factorial is 1");
        }
        else{
            int i = 1;
            while (i <= number){
                factorial = factorial * i;
                i ++;
            }
            }
        System.out.println("Factorial of " + number + " is "  + factorial);
        }
    }


