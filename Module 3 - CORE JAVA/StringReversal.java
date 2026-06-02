import java.util.Scanner;
// 15. String Reversal 
// • Objective: Manipulate strings. 
// • Task: Reverse a string entered by the user. 
// • Instructions: 
// o Prompt the user for a string. 
// o Use a loop or StringBuilder to reverse the string. 
// o Display the reversed string. 
public class StringReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Use StringBuilder to reverse the string
        StringBuilder reversed = new StringBuilder(str);
        reversed.reverse();

        // Display the original and reversed string
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }
}
