package Challenges;
import java.util.Random;
import java.util.Scanner;
public class numberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        int guess;
        System.out.println("Welcome to number guessing game\n");
        System.out.println("I have choosen a number between 1 to 100 try to guess ! ");
        do {
            System.out.println("Enter your guessed number");
            guess = input.nextInt();
            if (guess > numberToGuess) {

                System.out.println("Too high! Try again.\n");
            }
            else if (guess < numberToGuess) {
                System.out.println("Too low! Try again.\n");
            }
        }while (guess != numberToGuess);
        System.out.println("Corrct! you guessed the number " + numberToGuess);


    }

    }

