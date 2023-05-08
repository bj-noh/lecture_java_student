package Chap8_Example03_FileApplications;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.util.Random;
import java.util.Scanner;

public class MatrixFileHandler {
	private double[][] matrix;
	
	public MatrixFileHandler(int nums)	{		
		generateMatrix(nums, nums);		
	}
	
	public MatrixFileHandler(int numRow, int numCol)	{		
		generateMatrix(numRow, numCol);		
	}
	
	public MatrixFileHandler(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        int numRows = scanner.nextInt();
        int numCols = scanner.nextInt();

        this.matrix = new double[numRows][numCols];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
            	this.matrix[i][j] = scanner.nextDouble();
            }
        }
        scanner.close();		
	}
	
	public double[][] generateMatrix(int numRows, int numCols) {
		
        this.matrix = new double[numRows][numCols];
        
        Random rand = new Random();

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                this.matrix[i][j] = rand.nextDouble();
            }
        }
        return this.matrix;
    }
	
	public void printMatrix() {
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                System.out.print(this.matrix[i][j] + " ");
            }
            System.out.println();
        }
    }	
}
