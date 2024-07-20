import java.util.Random;
import java.util.Scanner;
public class GuessingNumber {
        public static void main(String[] args) {
            Random rand = new Random();
            int numberToGuess = rand.nextInt(100)+1;
            int attempts = 6;
            int score = 0;

            Scanner input = new Scanner(System.in);

            while (attempts > 0) {
                System.out.println("Guess a number between 1 and 100: ");
                int guess = input.nextInt();

                if (guess == numberToGuess) {
                    System.out.println("Correct!");
                    score++;
                    break;
                } else if (guess < numberToGuess) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }

                attempts--;
            }

            if (attempts == 0) {
                System.out.println("Game over! The number was " + numberToGuess);
            }

            System.out.println("Your score: " + score);
            System.out.println("Task1 is completed:");
        }
    }