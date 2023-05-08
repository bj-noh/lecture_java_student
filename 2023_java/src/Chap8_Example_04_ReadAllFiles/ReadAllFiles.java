package Chap8_Example_04_ReadAllFiles;

import java.io.*;

public class ReadAllFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String directoryPath = "./data/Chap8_Example_04_ReadAllFiles";

        File directory = new File(directoryPath);

        File[] fileList = directory.listFiles();

        for (File file : fileList) {
            if (file.isFile() && file.getName().endsWith(".txt")) {
            	
                try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                	
                    String line;
                    
                    while ((line = br.readLine()) != null) {
                        System.out.println(line);
                    }
                    
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
	}
}
