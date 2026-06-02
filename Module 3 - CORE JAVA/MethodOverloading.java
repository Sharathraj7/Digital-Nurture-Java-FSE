import java.lang.reflect.Method;

public class MethodOverloading {
//     12. Method Overloading 
// • Objective: Understand method overloading in Java. 
// • Task: Create multiple methods with the same name but different parameters. 
// • Instructions: 
// o Define methods named add that accept: 
// ▪ Two integers. 
// ▪ Two doubles. 
// ▪ Three integers. 
// o Each method should return the sum of its parameters. 
// o Call each method and display the results.
    public static void main(String[] args) {
        System.out.println("Method overloading examples:");

        int sum1 = add(10, 20);
        int sum2 = add(5, 6, 7);
        double sum3 = add(2.5, 3.5);

        System.out.println("add(int, int) = " + sum1);
        System.out.println("add(int, int, int) = " + sum2);
        System.out.println("add(double, double) = " + sum3);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static double add(double a, double b) {
        return a + b;
    }
}
