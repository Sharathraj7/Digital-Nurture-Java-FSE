public class TypeCasting {
//     7. Type Casting Example 
// • Objective: Practice type casting between different data types. 
// • Task: Convert a double to an int and vice versa. 
// • Instructions: 
// o Declare a double variable with a decimal value. 
// o Cast it to an int and display the result. 
// o Declare an int variable and cast it to a double, then display.
    public static void main(String[] args) {
        // Implicit Type Casting (Widening)
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println("Implicit Type Casting:");
        System.out.println("Integer value: " + myInt);
        System.out.println("Double value: " + myDouble);

        // Explicit Type Casting (Narrowing)
        double myDouble2 = 9.78;
        int myInt2 = (int) myDouble2; // Manual casting: double to int
        System.out.println("\nExplicit Type Casting:");
        System.out.println("Double value: " + myDouble2);
        System.out.println("Integer value: " + myInt2);
    }
}
