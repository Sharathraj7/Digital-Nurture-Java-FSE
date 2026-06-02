// Base class

// 18. Inheritance Example 
// • Objective: Implement inheritance. 
// • Task: Create a base class Animal and a subclass Dog. 
// • Instructions: 
// o Animal class should have a method makeSound(). 
// o Dog class should override makeSound() to print "Bark". 
// o Instantiate both classes and call their methods. 
class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Subclass that inherits from Animal
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // Instantiate Animal class
        Animal animal = new Animal();
        System.out.println("Animal class:");
        animal.makeSound();
        
        // Instantiate Dog class (subclass)
        Dog dog = new Dog();
        System.out.println("\nDog class:");
        dog.makeSound();
        
        // Dog can also be referenced as Animal (polymorphism)
        Animal animalRef = new Dog();
        System.out.println("\nDog referenced as Animal:");
        animalRef.makeSound();
    }
}
