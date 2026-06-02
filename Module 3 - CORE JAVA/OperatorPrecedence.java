public class OperatorPrecedence {

// 8. Operator Precedence 
// • Objective: Explore how Java evaluates expressions. 
// • Task: Evaluate and display the result of complex expressions. 
// • Instructions: 
// o Write expressions combining multiple operators, e.g., int result = 10 + 5 * 2;. 
// o Display the result and explain the order of operations.
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 2;

        // Example of operator precedence
        int result = a + b * c; // Multiplication is performed before addition
        System.out.println("Result of a + b * c: " + result); // Output will be 20

        // Using parentheses to change the order of operations
        result = (a + b) * c; // Addition is performed before multiplication
        System.out.println("Result of (a + b) * c: " + result); // Output will be 30
    }
}
