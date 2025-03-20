package Tasks;
//Write a program that calculates and displays the letter grade for a given numerical score
// (e.g., A, B, C, D, or F) based on the following grading scale:
//
//A: 90-100
//
//B: 80-89
//
//C: 70-79
//
//D: 60-69
//
//F: 0-59

import java.util.Scanner;

public class grade_5 {
    public static void main(String[] args) {
        Scanner sane = new Scanner(System.in);
        System.out.println("Enter the score: ");
        int n = sane.nextInt();
        if (n>89 & n <101){
            System.out.println("Garde : A");
        } else if (n>79 & n <90){
            System.out.println("Garde : B");
        } else if(n>60 & n <80){
            System.out.println("Garde : C");
        } else if(n>59 & n <70){
            System.out.println("Garde : D");
        } else if(n>=0 & n <60){
            System.out.println("Garde : F");
        } else {
            System.out.println("No negative marks");
        }

        int x = 3 , y = 4 , z = 5;
        double s =  Math.cbrt((Math.pow(x,2))+ (Math.pow(y,2)) + (Math.abs(z)));
        System.out.println(s);
    }
}
