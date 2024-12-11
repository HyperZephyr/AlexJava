// Code made by Alejandro Fernandez Patraca
import java.util.Scanner;
public class Apple {
	private String type;
	private double weight;
	private double price;
	
	private static final String[] VALID_TYPES = {"Red Delicious", "Golden Delicious", "Gala", "Granny Smith"};

	public Apple() {
		this.type = "Gala";
		this.weight = 0.0;
		this.price = 0.0;
	}
	
	public Apple(String type, double weight, double price) {
		setType(type);
		setWeight(weight);
		setPrice(price);
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		boolean validType = false;
		for (String valid : VALID_TYPES) {
			if (valid.equals(type)) {
				validType = true;
				break;
			}
		}
		
	if (validType) {
		this.type = type;
	} else {
		this.type = "Gala";
		}
	}
	
	public double geWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		if (weight >= 0 && weight <= 2) {
			this.weight = weight;
		} else {
			this.weight = 0.0;
		}
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		if (price >= 0) {
			this.price = price;
		} else {
			this.price = 0.0;
		}
	}
	
	public String toString() {
		return "Type: " + type + " weight: " + weight + " Price: " + price;
	}
	
	public boolean equal(Apple other) {
		return this.type.equals(other.type) && this.weight == other.weight && this.price == other.price;
	}
}
