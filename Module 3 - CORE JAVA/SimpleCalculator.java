import java.util.Scanner;

// 2. Simple Calculator 
// • Objective: Practice arithmetic operations and user input. 
// • Task: Develop a calculator that performs addition, subtraction, multiplication, and division. 
// • Instructions: 
// o Prompt the user to enter two numbers. 
// o Ask the user to choose an operation. 
// o Display the result of the operation.

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Choose an operation: +, -, *, /");
        String operation = scanner.next();
        switch (operation) {
            case "+":
                System.out.println("Sum: " + (num1 + num2));
                break;
            case "-":
                System.out.println("Difference: " + (num1 - num2));
                break;
            case "*":
                System.out.println("Product: " + (num1 * num2));
                break;
            case "/":
                System.out.println("Quotient: " + (num1 / num2));
                break;
            default:
                System.out.println("Invalid operation.");
                break;
        }
        
    }
}