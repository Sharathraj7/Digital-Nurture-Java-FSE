// 3. Even or Odd Checker 
// • Objective: Utilize conditional statements. 
// • Task: Determine if a number entered by the user is even or odd. 
// • Instructions: 
// o Prompt the user for an integer. 
// o Use the modulus operator % to check divisibility by 2. 
// o Display whether the number is even or odd.

public class EvenOrOdd {
    public static void main(String[] args) {
        int number = 10; // You can change this number to test with different values

        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}
