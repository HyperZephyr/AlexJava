//Code made by Alejandro Fernandez Patraca
import java.util.Scanner;

public class RectangleManager {
	//Array to store rectangles
	private static Rectangle[] rectangles;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean running = true;
		
		//Main loop to keep the program running until user decides to quit
		while (running) {
			//Display menu options
			displayMenu();
			int choice = scanner.nextInt();
			
			switch (choice) {
			case 1:
				// option to create rectangle data
				createRectangles(scanner);
				break;
			case 2:
				if (checkCollection()) {
					// Sort rectangles by area in ascending order
					sortRectanglesDescending();
					// Display sorted rectangles
					displayRectangles();
				}
				break;
			case 3:
				if (checkCollection()) {
					// Sort rectangles by area in descending order
					sortRectanglesDescending();
					// Display sorted rectangles
					displayRectangles();
				}
				break;
			case 4:	
				if (checkCollection()) {
					// Display the average area of the rectangles
					displayAverageArea();
				}
				break;
			case 5:
				if (checkCollection()) {
					// Display the minimum area of the rectangle
					displayMinimumArea();
				}
				break;
			case 6:
				if (checkCollection()) {
					// Display the maximum area of the rectangles
					displayMaximumArea();
				}
				break;
			case 7:
				// quit the program
				running = false;
				System.out.println("Goodbye! :D");
				break;
			default:
				System.out.println("Invalid option. Please try again.");
			}
		}
		// close the scanner resource
		scanner.close();
	}
	
	//Display the menu options to the user
	private static void displayMenu() {
		System.out.println("\nMenu:");
		System.out.println("1. Enter Rectangle Data"); 
		System.out.println("2. Sort and Display Rectangles' Areas (Smallest to Largest)");
		System.out.println("3. Sort and Display Rectangles' Areas (Largest to Smallest)"); 
		System.out.println("4. Display Average Area"); 
		System.out.println("5. Display Minimum Area");
		System.out.println("6. Display Maximum Area"); 
		System.out.println("7. Quit"); 
		System.out.print("Choose an option: ");
	}
	
	// Method to create and initialize the rectangles array based on user input
	private static void createRectangles(Scanner scanner) {
		System.out.print("Enter the number of rectangles");
		int size = scanner.nextInt();
		
		if (size <= 0) {
			System.out.println("Invalid size. Please enter a positive integer.");
			return;
		}
		
		// Initialize the array with the specified size
		rectangles = new Rectangle[size];
		
		for (int i = 0; i < size; i++) {
			System.out.print("Enter length and width for rectangle" + (i + 1) + ": ");
			double length = scanner.nextDouble();
			double width = scanner.nextDouble();
			// Create a new Rectangle object and store it in the array
			rectangles[i] = new Rectangle(length, width);
		}
	}
	
	// Method to check if the recangles array is created and not empty
	private static boolean checkCollection() {
		if (rectangles == null|| rectangles.length == 0) {
			System.out.println("The collection has not been created or is empty. ");
			return false;
		}
		return true;
	}
	
	// Method to sort the rectangles array by area in ascending order
	private static void sortRectanglesAscending() {
		for (int i = 0; i < rectangles.length - 1; i++) {
			for (int j = 0; j < rectangles.length - 1 - i; j++) {
				if (rectangles[j].getArea()> rectangles[j + 1].getArea()) {
					Rectangle temp = rectangles[j];
					rectangles[j] = rectangles[j + 1];
					rectangles[j + 1] = temp;
				}
			}
		}
	}
	
	// Method to sort the rectangles array by area in descending order
	private static void sortRectanglesDescending() {
		for (int i = 0; i < rectangles.length - 1; i++) {
			for (int j = 0; j < rectangles.length - 1 - i; j++) {
				if (rectangles[j].getArea() < rectangles[j + 1].getArea()) {
					Rectangle temp = rectangles[j];
					rectangles[j] = rectangles[j + 1];
					rectangles[j + 1] = temp;
				}
			}
		}
	}
	
	// Method to display the details of all rectangles in the array
	private static void displayRectangles() {
		for (Rectangle rectangle : rectangles) {
			System.out.println(rectangle);
		}
	}
	
	// Methods to calculate and display the average area of the rectangles
	private static void displayAverageArea() {
		double sum = 0;
		for (Rectangle rectangle : rectangles) {
			sum += rectangle.getArea();
		}
		double average = sum / rectangles.length;
		System.out.println("Average Area: " + average);
	}
	
	// Method to find and display the minimum area among the rectangles
	private static void displayMinimumArea() {
		double min = rectangles[0].getArea();
		for (Rectangle rectangle : rectangles) {
			if (rectangle.getArea() < min) {
				min = rectangle.getArea();
			}
		}
		System.out.println("Minimum Area: " + min);
	}
	
	// Method to find and display the maximum area among the rectangles
	private static void displayMaximumArea() {
		double max = rectangles[0].getArea();
		for (Rectangle rectangle : rectangles) {
			if (rectangle.getArea() > max) {
				max = rectangle.getArea();
			}
		}
		System.out.println("Maximum Area: " + max);
	}
}
