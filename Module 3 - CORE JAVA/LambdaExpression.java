import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 27. Lambda Expressions 
// • Objective: Use functional programming features. 
// • Task: Sort a list of strings using a lambda expression. 
// • Instructions: 
// o Create a List of strings. 
// o Use Collections.sort() with a lambda to sort the list. 
// o Display the sorted list.

public class LambdaExpression {
    public static void main(String[] args) {
        // Create a List of strings
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Cherry");
        fruits.add("Grapes");
        
        System.out.println("=== Lambda Expression Sorting Example ===\n");
        
        // Display original list
        System.out.println("Original list:");
        displayList(fruits);
        
        // Sort in ascending order using lambda expression
        System.out.println("\nSorted in ascending order (lambda):");
        Collections.sort(fruits, (s1, s2) -> s1.compareTo(s2));
        displayList(fruits);
        
        // Sort in descending order using lambda expression
        System.out.println("\nSorted in descending order (lambda):");
        Collections.sort(fruits, (s1, s2) -> s2.compareTo(s1));
        displayList(fruits);
        
        // Sort by length using lambda expression
        System.out.println("\nSorted by string length (lambda):");
        Collections.sort(fruits, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
        displayList(fruits);
        
        // Sort alphabetically ignoring case using lambda expression
        System.out.println("\nSorted alphabetically (case-insensitive) using lambda:");
        Collections.sort(fruits, (s1, s2) -> s1.compareToIgnoreCase(s2));
        displayList(fruits);
        
        // Additional example: Using forEach with lambda
        System.out.println("\nUsing forEach with lambda to print each item:");
        fruits.forEach(fruit -> System.out.println("  - " + fruit));
    }
    
    // Helper method to display list
    public static void displayList(List<String> list) {
        int index = 1;
        for (String item : list) {
            System.out.println("  " + index + ". " + item);
            index++;
        }
    }
}
