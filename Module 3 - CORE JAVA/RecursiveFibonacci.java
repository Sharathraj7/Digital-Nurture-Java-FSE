import java.util.Scanner;

// 13. Recursive Fibonacci 
// • Objective: Implement recursion. 
// • Task: Calculate the nth Fibonacci number using recursion. 
// • Instructions: 
// o Prompt the user for a positive integer n. 
// o Define a recursive method fibonacci(int n) that returns the nth Fibonacci number. 
// o Display the result. 
public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci terms to display: ");
        int n = scanner.nextInt();
        System.out.println("Fibonacci sequence up to " + n + ":");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
}
