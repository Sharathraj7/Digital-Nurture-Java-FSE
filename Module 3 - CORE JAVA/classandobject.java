// 18. Inheritance Example 
// • Objective: Implement inheritance. 
// • Task: Create a base class Animal and a subclass Dog. 
// • Instructions: 
// o Animal class should have a method makeSound(). 
// o Dog class should override makeSound() to print "Bark". 
// o Instantiate both classes and call their methods.


public class classandobject {
    int id;
    String name;

    public classandobject(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        classandobject obj1 = new classandobject(1, "Alice");
        classandobject obj2 = new classandobject(2, "Bob");

        obj1.display();
        obj2.display();
    }
}
