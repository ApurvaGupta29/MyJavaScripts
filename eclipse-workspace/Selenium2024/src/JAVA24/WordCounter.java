package JAVA24;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCounter {
    public static void main(String[] args) {
        // Path to the file
        String filePath = "path/to/your/textfile.txt";
        
        // Call the method to count words in the file
        int wordCount = countWordsInFile(filePath);
        
        // Print the total word count
        System.out.println("Total words in the file: " + wordCount);
    }

    public static int countWordsInFile(String filePath) {
        int wordCount = 0;
        
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            
            // Read each line of the file
            while ((line = br.readLine()) != null) {
                // Split the line into words using space as the delimiter
                String[] words = line.split("\\s+");
                
                // Update the word count
                wordCount += words.length;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return wordCount;
    }
}
