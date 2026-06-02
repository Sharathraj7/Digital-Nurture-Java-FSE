import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// 23. File Reading 
// • Objective: Read data from a file. 
// • Task: Read and display the contents of output.txt. 
// • Instructions: 
// o Open output.txt for reading. 
// o Read each line and display it on the console.
public class FileReading {
    public static void main(String[] args) {
        String fileName = "output.txt";
        
        try {
            // Open the file for reading
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            String line;
            int lineNumber = 1;
            
            System.out.println("Reading contents of " + fileName + ":\n");
            
            // Read each line and display it
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println("Line " + lineNumber + ": " + line);
                lineNumber++;
            }
            
            // Close the reader
            bufferedReader.close();
            System.out.println("\nFile read successfully!");
            
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Error: File '" + fileName + "' not found!");
            System.out.println("Make sure the file exists in the current directory.");
            
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
