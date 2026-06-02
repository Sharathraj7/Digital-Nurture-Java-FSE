import java.util.Scanner;
public class GradeCalculator {

// 9. Grade Calculator 
// • Objective: Use conditional statements to determine grades. 
// • Task: Assign grades based on marks entered by the user. 
// • Instructions: 
// o Prompt the user for marks out of 100. 
// o Use if-else statements to assign grades: 
// ▪ 90-100: A 
// ▪ 80-89: B 
// ▪ 70-79: C 
// ▪ 60-69: D 
// ▪ Below 60: F 
// o Display the assigned grade. 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the score: ");
        int score = scanner.nextInt();
        char grade;

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Score: " + score);
        System.out.println("Grade: " + grade);
    }
}
