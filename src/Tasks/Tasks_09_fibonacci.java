package Tasks;

import java.util.Scanner;

public class Tasks_09_fibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of sequences: ");
        int n = scanner.nextInt();

        int first = 0;
        int second = 1;
        int next = 0;
        System.out.print(first + ", " + second);

        for (int i = 2; i < n; i++) {
            next = first + second;
            System.out.print(", " + next);
            first = second;
            second = next;
        }
        scanner.close();
    }
}

