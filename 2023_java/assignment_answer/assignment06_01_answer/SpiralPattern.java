package assignment06_01_answer;
import java.util.Scanner;

public class SpiralPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the input number: ");
        int inputNumber = scanner.nextInt();

        int[][] spiral = new int[inputNumber][inputNumber];

        int value = 1;
        int minRow = 0, maxRow = inputNumber - 1;
        int minCol = 0, maxCol = inputNumber - 1;

        while (value <= inputNumber * inputNumber) {
            for (int i = minCol; i <= maxCol; i++) {
                spiral[minRow][i] = value;
                value++;
            }

            for (int i = minRow + 1; i <= maxRow; i++) {
                spiral[i][maxCol] = value;
                value++;
            }

            for (int i = maxCol - 1; i >= minCol; i--) {
                spiral[maxRow][i] = value;
                value++;
            }

            for (int i = maxRow - 1; i >= minRow + 1; i--) {
                spiral[i][minCol] = value;
                value++;
            }

            minCol++;
            minRow++;
            maxCol--;
            maxRow--;
        }

        printMatrix(spiral);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + "\t");
            }
            System.out.println();
        }
    }
}
