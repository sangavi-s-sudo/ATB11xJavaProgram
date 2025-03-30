package Tasks;

import java.util.Scanner;

public class Task_16_multiplication_table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = scanner.nextInt();

        for (int i = 0 ; i<n; i ++){
            for (int j=0; j < n; j++){
                System.out.print(i * j + "  ");
            }
            System.out.println();
        }
    }
}
