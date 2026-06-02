import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// 29. Records 
// • Objective: Use the record keyword for immutable data structures (Java 16+). 
// • Task: Create a record to represent a Person with name and age. 
// • Instructions: 
// o Define a record named Person. 
// o Create instances and print them. 
// o Use records in a List and filter based on age using Streams. 

// Record definition (Java 16+)
// Records automatically generate: constructor, getters, equals(), hashCode(), toString()
record Person(String name, int age) {
    // Optional: Add custom validation in constructor
    public Person {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }
}

public class Records {
    public static void main(String[] args) {
        System.out.println("=== Records Example ===\n");
        
        // Create instances of Person record
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 35);
        Person person3 = new Person("Charlie", 22);
        Person person4 = new Person("Diana", 30);
        Person person5 = new Person("Eve", 28);
        Person person6 = new Person("Frank", 19);
        
        // Print individual records
        System.out.println("Individual Person Records:");
        System.out.println("  " + person1);  // toString() is auto-generated
        System.out.println("  " + person2);
        System.out.println("  " + person3);
        System.out.println();
        
        // Access record fields (getters are auto-generated)
        System.out.println("Accessing record fields:");
        System.out.println("  " + person1.name() + " is " + person1.age() + " years old");
        System.out.println("  " + person2.name() + " is " + person2.age() + " years old");
        System.out.println();
        
        // Create a List of Person records
        List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        people.add(person6);
        
        // Display all people
        System.out.println("All People:");
        people.forEach(p -> System.out.println("  " + p.name() + " - Age: " + p.age()));
        System.out.println();
        
        // Filter people older than 25 using Streams
        System.out.println("People older than 25:");
        List<Person> olderThan25 = people.stream()
                                         .filter(p -> p.age() > 25)
                                         .collect(Collectors.toList());
        olderThan25.forEach(p -> System.out.println("  " + p));
        System.out.println();
        
        // Filter people under 30 using Streams
        System.out.println("People under 30:");
        List<Person> under30 = people.stream()
                                     .filter(p -> p.age() < 30)
                                     .collect(Collectors.toList());
        under30.forEach(p -> System.out.println("  " + p));
        System.out.println();
        
        // Filter and sort by age
        System.out.println("People sorted by age (ascending):");
        people.stream()
              .sorted((p1, p2) -> Integer.compare(p1.age(), p2.age()))
              .forEach(p -> System.out.println("  " + p));
        System.out.println();
        
        // Count people in age range
        System.out.println("Statistics:");
        long count20to30 = people.stream()
                                 .filter(p -> p.age() >= 20 && p.age() <= 30)
                                 .count();
        System.out.println("  People aged 20-30: " + count20to30);
        
        double averageAge = people.stream()
                                  .mapToInt(Person::age)
                                  .average()
                                  .orElse(0);
        System.out.println("  Average age: " + averageAge);
        System.out.println();
        
        // Test equality (equals() is auto-generated)
        System.out.println("Equality Test:");
        Person personA = new Person("Alice", 25);
        Person personB = new Person("Alice", 25);
        System.out.println("  personA equals personB: " + personA.equals(personB));
        System.out.println("  personA hashCode: " + personA.hashCode());
        System.out.println("  personB hashCode: " + personB.hashCode());
    }
}
