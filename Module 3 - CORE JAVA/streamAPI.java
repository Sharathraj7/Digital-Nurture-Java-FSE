import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// 28. Stream API 
// • Objective: Process collections using streams. 
// • Task: Filter and display even numbers from a list. 
// • Instructions: 
// o Create a List of integers. 
// o Use the Stream API to filter even numbers. 
// o Collect and display the result.
public class streamAPI {
    public static void main(String[] args) {
        // Create a List of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(15);
        numbers.add(22);
        numbers.add(8);
        numbers.add(45);
        numbers.add(30);
        numbers.add(17);
        numbers.add(42);
        numbers.add(9);
        numbers.add(56);
        numbers.add(11);
        
        System.out.println("=== Stream API Example ===\n");
        
        // Display original list
        System.out.println("Original list of numbers:");
        System.out.println(numbers);
        
        // Filter even numbers using Stream API
        System.out.println("\nFiltering even numbers:");
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);
        
        // Filter and sort even numbers
        System.out.println("\nEven numbers sorted:");
        List<Integer> sortedEvenNumbers = numbers.stream()
                                                  .filter(n -> n % 2 == 0)
                                                  .sorted()
                                                  .collect(Collectors.toList());
        System.out.println(sortedEvenNumbers);
        
        // Filter odd numbers
        System.out.println("\nOdd numbers:");
        List<Integer> oddNumbers = numbers.stream()
                                          .filter(n -> n % 2 != 0)
                                          .collect(Collectors.toList());
        System.out.println(oddNumbers);
        
        // Filter numbers greater than 20
        System.out.println("\nNumbers greater than 20:");
        List<Integer> greaterThan20 = numbers.stream()
                                             .filter(n -> n > 20)
                                             .collect(Collectors.toList());
        System.out.println(greaterThan20);
        
        // Count even numbers
        System.out.println("\nCount of even numbers:");
        long evenCount = numbers.stream()
                                .filter(n -> n % 2 == 0)
                                .count();
        System.out.println("Total even numbers: " + evenCount);
        
        // Sum of even numbers
        System.out.println("\nSum of even numbers:");
        int sumOfEven = numbers.stream()
                               .filter(n -> n % 2 == 0)
                               .mapToInt(Integer::intValue)
                               .sum();
        System.out.println("Sum: " + sumOfEven);
        
        // Average of even numbers
        System.out.println("\nAverage of even numbers:");
        double averageOfEven = numbers.stream()
                                      .filter(n -> n % 2 == 0)
                                      .mapToInt(Integer::intValue)
                                      .average()
                                      .orElse(0);
        System.out.println("Average: " + averageOfEven);
        
        // Using forEach to display even numbers
        System.out.println("\nEven numbers using forEach:");
        numbers.stream()
               .filter(n -> n % 2 == 0)
               .forEach(n -> System.out.print(n + " "));
        System.out.println();
        
        // Using map to square all even numbers
        System.out.println("\nSquare of even numbers:");
        List<Integer> squaredEven = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .map(n -> n * n)
                                           .collect(Collectors.toList());
        System.out.println(squaredEven);
    }
}
