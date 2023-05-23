package assignment08_01;

import java.util.Arrays;
import java.util.Random;

public class MusicSelectorTest {
	
	public static void printResult(String[][] data) {
		System.out.println("\n\n============================================= Result =============================================");
		System.out.println(String.format("%-30s%-60s%s", "Artist", "Title", "Cluster"));
        System.out.println("==================================================================================================");
        for (int i = 0; i < data.length; i++) {
            System.out.println(String.format("%-30s%-60s%s", data[i][0], data[i][1], data[i][2]));
        }        
	}	
	
    public static void main(String[] args) {
    	
    	DataReader data = new DataReader("data/Assignment8_01_musicData.txt");
    	MusicSelector selector = new MusicSelector();
    	
    	String[][] result = selector.selector(data.musicData, "ABBA");
    	
    	printResult(result);
    	// checkNoConsecutiveSameArtists(data.musicData);
    }
    
}