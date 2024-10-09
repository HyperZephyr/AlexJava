// Made by Alejandro Fernandez Patraca
import java.util.Scanner;
public class BinaryConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		// Accept two four-digit binary numbers
		System.out.println("Enter 4-bit binary number: ");
		String binary1 = scanner.nextLine();
		System.out.println("Enter another 4-bit binary number: ");
		String binary2 = scanner.nextLine();
		
		// Convert binary numbers to decimal manually
		int decimal1 = binaryToDecimal(binary1);
		int decimal2 = binaryToDecimal(binary2);
		
		// Add the decimal values
		int sum = decimal1 +  decimal2;
		
		// Print the decimal values and the result of the addition
		System.out.println("The first number is: " + decimal1);
		System.out.println("The second number is: "+ decimal2);
		System.out.println("Added together is: " + sum);
	}
	
	// Method to convert binary string to decimal
	public static int binaryToDecimal(String binary) {
		int decimal = 0;
		int base = 1; //2^0
		
		// converts the binary string to decimal by repeating it from left to right
		for (int i = binary.length() - 1; i >= 0; i--) {
			if (binary.charAt(i) == '1') { //for each '1' the binary string adds the current base value to the decimal result
				decimal += base;
			}
			base *=2; //Multiply the base by 2 for the next higher power of 2
		}
		return decimal;
	}

}
