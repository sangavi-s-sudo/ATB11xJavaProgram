package ex_02_java;

import java.util.Scanner;

public class Input_args {
    public static void main(String[] args) {
        Scanner scans = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scans.nextInt();

        int s1 = Integer.parseInt(args[0]);
        System.out.println(s1);
    }
}
