import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Filewritting {
//     22. File Writing 
// • Objective: Write data to a file. 
// • Task: Write user input to a text file. 
// • Instructions: 
// o Prompt the user for a string. 
// o Write the string to a file named output.txt. 
// o Confirm that the data has been written.
    public static void main(String[] args) {
            try {
                FileWriter writer = new FileWriter("output.txt");
                writer.write("Hello, this is a test file.");
                writer.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred while writing to the file.");
                e.printStackTrace();
            }
    }
}
