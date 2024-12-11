// Code made by Alejandro Fernandez Patraca
public class Rectangle {
	// Private member variables to store the dimensions of the rectangle
	private double length;
	private double width;
	
	// Constructor to initialize the length and width of the rectangle
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	// Method to calculate and return the area of the rectangle
	public double getArea() {
		return length * width;
	}
	
	// Getter method to return the length of the rectangle
	public double getLength() {
		return length;
	}
	
	// Getter method to return the width of the rectangle
	public double getWidth() {
		return width;
	}
	
	// Overriding the toString() method to provide a string representation of the rectangle
	@Override
	public String toString() {
		return "Rectangle [Length: " + ", width: " + width + ", Area: " + getArea() +"]";
	}
}
