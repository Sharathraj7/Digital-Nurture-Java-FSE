import java.util.regex.Pattern;

public class PatternMatchingSwitch {
//     30. Pattern Matching for switch (Java 21) 
// • Objective: Simplify conditional logic with pattern matching in enhanced switch expressions. 
// • Task: Determine the type of an object and respond accordingly. 
// • Instructions: 
// o Create a method that accepts Object as input. 
// o Use a switch expression to check if the object is Integer, String, Double, etc. 
// o Print a message based on the object’s type.

    public static void checkType(Object obj) {

        String result = switch (obj) {
            case Integer i -> "Integer value: " + i;
            case String s -> "String value: " + s;
            case Double d -> "Double value: " + d;
            case Float f -> "Float value: " + f;
            case Long l -> "Long value: " + l;
            case null -> "Object is null";
            default -> "Unknown type: " + obj.getClass().getSimpleName();
        };

        System.out.println(result);
    }

    public static void main(String[] args) {
        checkType(100);
        checkType("Hello");
        checkType(12.5);
        checkType(5.6f);
        checkType(999L);
        checkType(null);
        checkType(true);
    }
}