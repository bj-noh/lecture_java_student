package Chap8_Example_02_FileIO;

import java.io.IOException;

public class FileHandlerTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileHandler handler = new FileHandler();		
		handler.FileCreate("./data/test.txt.txt");
		
		handler.readUsingFileReader("./data/Chap8_Example_02_FileIO_inputText.txt");		
		handler.readUsingInputStream("./data/Chap8_Example_02_FileIO_inputText.txt");		
		handler.readUsingBufferedInputStream("./data/Chap8_Example_02_FileIO_inputText.txt");		

		handler.writeUsingFileWriter("./data/outputUsingFileWriter.txt", "Hello, world!");
		handler.writeUsingOutputStream("./data/outputUsingOStream.txt", "Hello, world!");
		handler.writeUsingBufferedOutputStream("./data/outputUsingBOStream.txt", "Hello, world!");
		
		
		
	}
}
