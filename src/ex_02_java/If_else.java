package ex_02_java;

import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println(age);

      if (age>18){
          System.out.println("yes you can vote");
        }
      else {
          System.out.println("No you can't vote");
      }

    }
}
