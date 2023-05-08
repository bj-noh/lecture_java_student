package Chap8_Example03_FileApplications;

import java.io.FileNotFoundException;

public class MatrixFileHandlerTest {

	public static void main(String[] args) throws FileNotFoundException {
		
		MatrixFileHandler MHandlerByGenerator = new MatrixFileHandler(5, 5);
		MatrixFileHandler MHandlerFromFile = new MatrixFileHandler("./data/Chap8_Example_03_FileApplications_inputMatrix.txt");
		
		MHandlerByGenerator.printMatrix();
		MHandlerFromFile.printMatrix();
	}
}
