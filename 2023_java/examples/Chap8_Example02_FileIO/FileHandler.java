package Chap8_Example02_FileIO;

import java.io.File;
import java.io.FileNotFoundException;

import java.io.IOException;

import java.io.FileReader;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.BufferedInputStream;

import java.io.FileWriter;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;

public class FileHandler {
	
	public void FileCreate(String filename) throws IOException {
		File file = new File(filename);
		boolean created = file.createNewFile();
		
		if (created) {
			System.out.println("File created - " + filename);
		}
		
		else {
			System.out.println("Failed: File not created");
		}		
	}
	
	public static void readUsingFileReader(String filename) throws IOException {
        System.out.println("Reading using FileReader:");
        FileReader reader = new FileReader(filename);
        int cur;
        while ((cur = reader.read()) != -1) {
            System.out.print((char) cur);
        }
        reader.close();
    }

    public static void readUsingInputStream(String filename) throws IOException {
        System.out.println("\nReading using InputStream:");
        InputStream in = new FileInputStream(filename);
        int cur;
        while ((cur = in.read()) != -1) {
            System.out.print((char) cur);
        }
        in.close();
    }

    public static void readUsingBufferedInputStream(String filename) throws IOException {
    	System.out.println("\nReading using BufferedInputStream:");    	
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(filename));
        int cur;
        while ((cur = in.read()) != -1) {
            System.out.print((char) cur);
        }
        in.close();
    }

    public static void writeUsingFileWriter(String filename, String content) throws IOException {
    	System.out.println("\nWriting using FileWriter:");
        FileWriter writer = new FileWriter(filename);
        writer.write(content);
        writer.close();
    }

    public static void writeUsingOutputStream(String filename, String content) throws IOException {
        System.out.println("\nWriting using OutputStream:");
        OutputStream out = new FileOutputStream(filename);
        byte[] bytes = content.getBytes();
        out.write(bytes);
        out.close();
    }

    public static void writeUsingBufferedOutputStream(String filename, String content) throws IOException {
        System.out.println("\nWriting using BufferedOutputStream:");
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(filename));
        byte[] bytes = content.getBytes();
        out.write(bytes);
        out.close();
    }
}
