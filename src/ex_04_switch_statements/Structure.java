package ex_04_switch_statements;

import java.util.Scanner;

public class Structure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day numbers from 1 to 7: ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Sunday");
                
            case 2:
                System.out.println("MONDAY");
            case 3:
                System.out.println("tuesday");
            case 4:
                System.out.println("Wednesday");
                
            case 5:
                System.out.println("Thursday");
                
            case 6:
                System.out.println("Friday");
                
            case 7:
                System.out.println("Saturday");
                
            default:
                System.out.println("Invalid day");
                
        }
    }
}
