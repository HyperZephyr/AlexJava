// Alejandro Fernandez Patraca
import java.util.Scanner;
public class AppleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to the apple tester!");
		
		Apple defaultApple = new Apple();
		System.out.println("Creating a default apple...");
		System.out.println("Getting apple's default values");
		System.out.println(defaultApple);
		
		System.out.println("Enter a type of apple \"Enter the type of the apple (Red Delicious, Golden Delicious, Gala, Granny Smith): ");
		String type = scanner.nextLine();
		
		System.out.println("Enter the weight of the apple");
		double weight = scanner.nextDouble();
		
		System.out.println("Enter the price of the apple");
		double price = scanner.nextDouble();
		
		Apple userApple = new Apple(type, weight, price);
		System.out.println("Apple has been created with the values given: ");
		System.out.println(userApple);
		
		Apple anotherApple = new Apple();
		System.out.println("Creating another default apple");
		
		anotherApple.setType("Red Delicious");
		anotherApple.setWeight(3.0);
		anotherApple.setPrice(1.5);
		System.out.println("Setting chosen values to the second apple:"); 
		System.out.println(anotherApple);
		
		System.out.println("Checking if the default apple and the one with invalid values have the same values:"); 
		System.out.println(defaultApple.equals(anotherApple));
		
		scanner.close();
}
} 