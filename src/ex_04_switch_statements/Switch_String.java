package ex_04_switch_statements;

import java.util.Scanner;

public class Switch_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser name: ");
        String browser = scanner.next();


        switch (browser) {
            case "chrome":
                System.out.println("do this");
                break;
            case "edge":
                System.out.println("so that");
                break;
            case "firefox":
                System.out.println("enter this");
                break;
            default:
                System.out.println("no browser");
        }
    }
}
