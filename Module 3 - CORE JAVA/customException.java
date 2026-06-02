import java.util.Scanner;

// 21. Custom Exception 
// • Objective: Create and use custom exceptions. 
// • Task: Define a custom exception InvalidAgeException. 
// • Instructions: 
// o Throw InvalidAgeException if the user's age is less than 18. 
// o Catch the exception and display a message. 
// Custom Exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class customException {
    
    // Method to validate age
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older. You are only " + age + " years old.");
        } else {
            System.out.println("Age is valid. You are " + age + " years old.");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            
            // Call validateAge method
            validateAge(age);
            
        } catch (InvalidAgeException e) {
            System.out.println("Custom Exception caught: " + e.getMessage());
            
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer for age!");
            
        } finally {
            scanner.close();
        }
    }
}
