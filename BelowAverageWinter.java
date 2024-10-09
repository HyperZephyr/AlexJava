// Made by Alejandro Fernandez Patraca
import java.util.Scanner;
public class BelowAverageWinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double[] temperatures = new double [10];
		double sum = 0;
		
		System.out.println("Welcome to the below average temperature tester program.");
		
		// input of the temperature for the following 10 days
		for (int i = 0; i < 10; i++) {
			System.out.println("Please enter the temeperature for day " + (i + 1)+ ":");
			temperatures[i] = scanner.nextDouble();
			sum += temperatures[i];
		}
		// Calculates the Average temperature
		double average = sum / 10;
		System.out.println("The average temperature was: " + average);
		
		// Finds and prints the days with below average temperatures
		System.out.println("The days that were below average were:");
		for (int i = 0; i < 10; i++) {
			if (temperatures[i] < average) {
				System.out.println("Day " + (i + 1) + " with temperature  " + temperatures[i]);
			}
		}
		
		scanner.close();
	}

}
