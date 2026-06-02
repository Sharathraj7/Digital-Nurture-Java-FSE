import java.util.Scanner;

public class try_catch {
//     20. Try-Catch Example 
// • Objective: Handle exceptions gracefully. 
// • Task: Handle division by zero using try-catch. 
// • Instructions: 
// o Prompt the user for two integers. 
// o Attempt to divide the first by the second. 
// o Catch any ArithmeticException and display an appropriate message. 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Prompt user for first integer
            System.out.print("Enter the first integer (dividend): ");
            int dividend = scanner.nextInt();
            
            // Prompt user for second integer
            System.out.print("Enter the second integer (divisor): ");
            int divisor = scanner.nextInt();
            
            // Attempt division
            int result = dividend / divisor;
            System.out.println("Division result: " + dividend + " / " + divisor + " = " + result);
            
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
            System.out.println("Exception message: " + e.getMessage());
            
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Please enter valid integers only!");
            
        } finally {
            scanner.close();
            System.out.println("Scanner closed. Program terminated.");
        }
    }
}
