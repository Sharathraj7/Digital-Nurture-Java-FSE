import java.lang.reflect.*;

public class ReflectionDemo {

    public static void main(String[] args) {

        try {

            Class<?> cls = Class.forName("Student");

            System.out.println("Class Name: " + cls.getName());

            Method[] methods = cls.getDeclaredMethods();

            System.out.println("\nMethods:");

            for (Method m : methods) {

                System.out.println("Method Name: " + m.getName());

                Parameter[] params = m.getParameters();

                System.out.print("Parameters: ");

                for (Parameter p : params) {
                    System.out.print(
                            p.getType().getSimpleName() + " ");
                }

                System.out.println("\n");
            }

            Object obj =
                    cls.getDeclaredConstructor().newInstance();

            Method m1 =
                    cls.getDeclaredMethod("display");

            m1.invoke(obj);

            Method m2 =
                    cls.getDeclaredMethod(
                            "showName",
                            String.class);

            m2.invoke(obj, "Sharath");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
