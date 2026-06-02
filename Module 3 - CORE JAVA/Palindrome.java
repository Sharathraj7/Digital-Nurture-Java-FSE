import java.util.Scanner;
public class Palindrome {

//  16. Palindrome Checker 
// • Objective: Combine string manipulation and conditional logic. 
// • Task: Check if a string is a palindrome. 
// • Instructions: 
// o Prompt the user for a string. 
// o Remove any non-alphanumeric characters and convert to lowercase. 
// o Check if the string reads the same forwards and backwards. 
// o Display the result. 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder reversed = new StringBuilder(str);
        reversed.reverse();
        if (str.equals(reversed.toString())) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        scanner.close();
    }
}
