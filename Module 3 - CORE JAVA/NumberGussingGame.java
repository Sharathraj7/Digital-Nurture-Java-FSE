import java.util.Scanner;
// 10. Number Guessing Game 
// • Objective: Implement loops and conditional logic. 
// • Task: Create a game where the user guesses a randomly generated number. 
// • Instructions: 
// o Generate a random number between 1 and 100. 
// o Prompt the user to guess the number. 
// o Provide feedback if the guess is too high or too low. 
// o Continue until the user guesses correctly. 
public class NumberGussingGame {
    public static void main(String[] args) {
        int number = (int)(Math.random() * 100) + 1; // Generate a random number between 1 and 100
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();
        while (guess != number) {
            
        if (guess < number) {
            System.out.println("Too low! Try again.");
        } else {
            System.out.println("Too high! Try again.");
        }
        guess = scanner.nextInt();

    }
    System.out.println("Congratulations! You guessed the number.");
    }
}
