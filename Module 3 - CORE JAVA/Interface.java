// Interface definition
// 19. Interface Implementation 
// • Objective: Use interfaces in Java. 
// • Task: Define an interface Playable with a method play(). 
// • Instructions: 
// o Implement the interface in classes Guitar and Piano. 
// o Each class should provide its own implementation of play(). 
// o Instantiate the classes and call the method. 
interface Playable {
    void play();
}

// Guitar class implements Playable
class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Guitar: Strumming strings...");
    }
}

// Piano class implements Playable
class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Piano: Pressing keys...");
    }
}

public class Interface {
    public static void main(String[] args) {
        // Instantiate Guitar
        Guitar guitar = new Guitar();
        System.out.println("Guitar:");
        guitar.play();
        
        // Instantiate Piano
        Piano piano = new Piano();
        System.out.println("\nPiano:");
        piano.play();
        
        // Using interface references (polymorphism)
        System.out.println("\nUsing Playable interface references:");
        Playable instrument1 = new Guitar();
        Playable instrument2 = new Piano();
        
        System.out.println("Instrument 1:");
        instrument1.play();
        
        System.out.println("\nInstrument 2:");
        instrument2.play();
    }
}
