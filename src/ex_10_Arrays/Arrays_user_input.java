package ex_10_Arrays;

import java.util.Scanner;

public class Arrays_user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();

        int[] marks = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the elements");
            marks[i] = sc.nextInt();
        }
        System.out.println("The final array elements are");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

    }
}
