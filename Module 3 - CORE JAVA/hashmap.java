import java.util.HashMap;
import java.util.Scanner;

// 25. HashMap Example 
// • Objective: Use key-value pairs. 
// • Task: Map student IDs to names. 
// • Instructions: 
// o Create a HashMap with Integer keys and String values. 
// o Allow the user to add entries. 
// o Retrieve and display a name based on an entered ID.
public class hashmap {
    public static void main(String[] args) {
        // Create a HashMap with Integer keys (student IDs) and String values (names)
        HashMap<Integer, String> students = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("=== Student ID to Name Mapper ===\n");
            
            // Allow user to add entries
            System.out.print("Enter the number of students to add: ");
            int numberOfStudents = scanner.nextInt();
            
            for (int i = 0; i < numberOfStudents; i++) {
                System.out.print("Enter student ID: ");
                int studentID = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                
                System.out.print("Enter student name: ");
                String studentName = scanner.nextLine();
                
                // Add entry to HashMap
                students.put(studentID, studentName);
                System.out.println("Added: ID " + studentID + " -> " + studentName + "\n");
            }
            
            // Display all entries
            System.out.println("=== All Student Entries ===");
            if (students.isEmpty()) {
                System.out.println("No students added.");
            } else {
                for (Integer id : students.keySet()) {
                    System.out.println("ID " + id + ": " + students.get(id));
                }
            }
            
            // Retrieve and display a name based on entered ID
            System.out.println("\n=== Retrieve Student by ID ===");
            System.out.print("Enter a student ID to search: ");
            int searchID = scanner.nextInt();
            
            if (students.containsKey(searchID)) {
                System.out.println("Student found! Name: " + students.get(searchID));
            } else {
                System.out.println("Error: Student ID " + searchID + " not found in the system.");
            }
            
            // Display HashMap size
            System.out.println("\nTotal students in system: " + students.size());
            
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Please enter valid input!");
            
        } finally {
            scanner.close();
        }
    }
}
