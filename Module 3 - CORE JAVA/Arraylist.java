import java.util.ArrayList;
import java.util.Scanner;
// 24. ArrayList Example 
// • Objective: Use dynamic arrays. 
// • Task: Manage a list of student names. 
// • Instructions: 
// o Create an ArrayList to store names. 
// o Allow the user to add names to the list. 
// o Display all names entered.
public class Arraylist {
    public static void main(String[] args) {
        // Create an ArrayList to store student names
        ArrayList<String> studentNames = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("=== Student Name Manager ===\n");
            
            // Allow user to add names
            System.out.print("Enter the number of students: ");
            int numberOfStudents = scanner.nextInt();
            scanner.nextLine(); // Consume the newline after nextInt()
            
            // Add names to the ArrayList
            for (int i = 1; i <= numberOfStudents; i++) {
                System.out.print("Enter student " + i + " name: ");
                String name = scanner.nextLine();
                studentNames.add(name);
            }
            
            // Display all names entered
            System.out.println("\n=== All Student Names ===");
            if (studentNames.isEmpty()) {
                System.out.println("No students added.");
            } else {
                for (int i = 0; i < studentNames.size(); i++) {
                    System.out.println((i + 1) + ". " + studentNames.get(i));
                }
            }
            
            // Additional ArrayList operations
            System.out.println("\n=== ArrayList Information ===");
            System.out.println("Total students: " + studentNames.size());
            
            if (!studentNames.isEmpty()) {
                System.out.println("First student: " + studentNames.get(0));
                System.out.println("Last student: " + studentNames.get(studentNames.size() - 1));
            }
            
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Please enter a valid number!");
            
        } finally {
            scanner.close();
        }
    }
}
