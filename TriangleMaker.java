import java.util.Scanner;
public class TriangleMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creates a Scanner object to read input from the user
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Welcome to Triangle Maker!  Enter the size of the triangle: ");
	        int size = scanner.nextInt();

	        // Increasing part of the triangle
	        for (int i = 1; i <= size; i++) {
	        	//prints "*" for the current row
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	        // Decreasing part of the triangle
	        for (int i = size - 1; i >= 1; i--) {
	        	// Prints "*" for the current row
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
	}