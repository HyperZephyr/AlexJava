// Code made by Alejandro Fernandez Patraca
import java.util.Scanner;
public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);

// Welcome message
System.out.println("Welcome to the matrix added program :) ");

// Prompt user for the dimensions of the first matrix
System.out.println("Please enter the length and width of the first matrix");
System.out.print("Number of rows: ");
int rows1 = scanner.nextInt();
System.out.print("number of columns: ");
int cols1 =scanner.nextInt();

// Initialize the first matrix
int[][] matrixA = new int[rows1][cols1];

// Populate the first matrix
System.out.println("Enter the elements of the first matrix:");
for (int i = 0; i< rows1; i++) {
	for(int j = 0; j < cols1; j++) {
		System.out.print("Enter value at index [" + i + "][" + j + "]");
		matrixA[i][j] = scanner.nextInt();
	}
}

// Prompt user for the dimensions of the second matrix
System.out.println("Please enter the length and width of the second matrix");
System.out.print("Number of rows: ");
int rows2 = scanner.nextInt();
System.out.print("Number of columns: ");
int cols2 = scanner.nextInt();

// Check if dimensions match
if (rows1 != rows2 || cols1 != cols2) {
	System.out.println("Error: Matrices dimensions do not match. :( ");
	scanner.close();
	return;
}

// Initialize the second matrix
int[][] matrixB = new int[rows2][cols2];

// Populate the second matrix
System.out.println("Enter the elements of the second matrix: ");
for (int i = 0; i < rows2; i++) {
	for (int j = 0; j < cols2; j++) {
		System.out.print("Enter value at index [" + i + "][" + j + "]");
		matrixB[i][j] = scanner.nextInt();
	}
}

// Initialize the resulting matrix
int[][] matrixC = new int[rows1][cols1];

// Add matrices A and B to get Matrix C
for (int i= 0; i < rows1; i++) {
	for (int j = 0; j < cols1; j++) {
		matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
	}
}

// Print matrices
System.out.println("First Matrix:");
printMatrix(matrixA);
System.out.println("Second Matrix:");
printMatrix(matrixB);
System.out.println("Resulting Matrix (First + Second):");
printMatrix(matrixC);

scanner.close();

	}

// Method to print a matrix
public static void printMatrix(int[][] matrix) {
	for (int[] row : matrix) {
		for (int element : row) {
			System.out.print(element + "");
		}
		System.out.println();
	}
}
}
