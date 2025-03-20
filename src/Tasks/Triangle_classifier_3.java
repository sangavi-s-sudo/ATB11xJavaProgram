package Tasks;
//  Triangle Classifier:
//
// Write a program that classifies a triangle based on its side lengths.
// Given three input values representing the lengths of the sides,
// determine if the triangle is equilateral (all sides are equal),
// isosceles (exactly two sides are equal),
// or scalene (no sides are equal).
// Use an if-else statement to classify the triangle.

import java.util.Scanner;

public class Triangle_classifier_3 {
    public static void main(String[] args) {
        Scanner sans = new Scanner(System.in);
        System.out.println("Enter 1st side: " );
        int n1 = sans.nextInt();
        System.out.println("Enter 2nd side: " );
        int n2 = sans.nextInt();
        System.out.println("Enter 3rd side: " );
        int n3 = sans.nextInt();


        if ((n1 == n2) && (n1 == n3)) {
            System.out.println("equilateral Triangle");
        } else if ((n1 == n2) || (n1 == n3) || (n3 == n2)){
            System.out.println("Isosceles Triangle");
        }
        else {
            System.out.println("scalene Triangle");
        }
    }
}
