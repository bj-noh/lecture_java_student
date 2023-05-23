package assignment08_01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {
	public String[][] musicData;
	
	public DataReader(String fileName) {
        int lineCount = countLines(fileName);
        this.musicData = new String[lineCount][3]; // artists, title, cluster

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int index = 0;
            while ((line = reader.readLine()) != null) {
                String[] artistSong = line.split("\t");
                this.musicData[index][0] = artistSong[0].trim();
                this.musicData[index][1] = artistSong[1].trim();
                this.musicData[index][2] = artistSong[2].trim();
                index++;
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        
        // Print the first 10 rows to preview
        System.out.println(String.format("%-30s%-60s%s", "Artist", "Title", "Cluster"));
        System.out.println("==================================================================================================");
        for (int i = 0; i < 10; i++) {
            System.out.println(String.format("%-30s%-60s%s", this.musicData[i][0], this.musicData[i][1], this.musicData[i][2]));
        }        
	}
	
	public static int countLines(String fileName) {
        int lines = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while (reader.readLine() != null) {
                lines++;
            }
        } catch (IOException e) {
            System.err.println("Error counting lines: " + e.getMessage());
        }
        return lines;
    }

}
