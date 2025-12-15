package ex_06_while;

import java.util.Random;
import java.util.Scanner;

public class While_guessing_game {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number between 1 to 10: ");
        int numbertoGuess = scanner.nextInt();

        int attempts = 0;
        while (true) {
            attempts ++;
            Random random = new Random();
            int userGuess = random.nextInt(11);
            if (numbertoGuess > userGuess) {
                System.out.println( userGuess + "is Too low !");
            } else if (numbertoGuess < userGuess) {
                System.out.println(userGuess  + "is Too High !");
            } else {
                System.out.println("YAY! correct number matched!!");
                break;
            }

        }
        System.out.println("You took " + attempts + " attempts to guess the number");
    }

}
