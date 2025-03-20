package Tasks;
// CLI Options
//
//Take a user input - Name, Age and Salary and print them in the end.
//
//Take a user input 3 numbers from the arguments and
// calculate the maximum in between with ternary operator.

import java.util.Scanner;

public class CLI_2 {
    public static void main(String[] args) {

        // task 1
        Scanner san = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = san.next();
        System.out.println("Enter your age: ");
        int age = san.nextInt();
        System.out.println("Enter your salary: ");
        int salary = san.nextInt();

        System.out.println("I am " + name + '.');
        System.out.println("My age is "+ age);
        System.out.println("And my salary is "+ salary);


        // Task 2

        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt(args[2]);
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        System.out.println("n3 = " + n3);

        int out = ((n1> n2) ? ((n1>n3) ? n1 : n3) : ((n2>n3)? n2 : n3));
        System.out.println("maximum of three numbers is " + out);

        san.close();
    }
}

