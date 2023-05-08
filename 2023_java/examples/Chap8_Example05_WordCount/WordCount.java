package Chap8_Example05_WordCount;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String filePath = "./data/Chap8_Example_05_WordCount_inputText.txt"; // Set the path to the text file
        String wordToFind = "License"; // Set the word to find

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int count = 0;

            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+"); // Split the line into words

                for (String word : words) {
                    if (word.equals(wordToFind)) {
                        count++; // Increment the count if the word is found
                    }
                }
            }

            System.out.println("The word '" + wordToFind + "' appears " + count + " times in the file.");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
