import java.util.Scanner;
// 14. Array Sum and Average 
// • Objective: Work with arrays and perform calculations. 
// • Task: Calculate the sum and average of elements in an array. 
// • Instructions: 
// o Prompt the user to enter the number of elements. 
// o Read the elements into an array. 
// o Calculate and display the sum and average. 
public class ArraySumandAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Create array
        int[] numbers = new int[n];

        // Read elements into the array
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Calculate the sum of the array elements
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Calculate the average
        double average = (double) sum / numbers.length;

        // Display the results
        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + average);

        scanner.close();
    }
}
