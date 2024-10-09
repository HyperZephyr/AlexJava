/*
 * Written by Alejandro Fernandez Patraca
 */
import java.util.Scanner;
public class ZodiacSigns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Whats your zodiac sign?");
		System.out.println("Enter your Birthday--Month followed by day as numbers");
		
		// Prompt the user to enter a month (1-12)
		System.out.println("Enter your month:");
		int month = keyboard.nextInt();
		
		//check if the month is valid
		if (month < 1 || month > 12) {
			System.out.println("Invalid month!");
			return;
		}
		
		// Prompt the user to enter a day (1-31)
		System.out.println("Enter day (1-31): ");
		int day = keyboard.nextInt();
		
		//check if the day is valid
		if(day < 1 || day > 31) {
			System.out.println("Invalid Day!");
			return;
		}
		
		// calls out the getZodiacSign method with the month and day, and stores the result in zodiacSign
		String ZodiacSign = getZodiacSign(month, day);
		System.out.println(month + "/" + day + " means you are a " + ZodiacSign);
		// Print the Zodiac sign to the sign

	}
	// Method to determine the Zodiac sign based on the month and day
	public static String getZodiacSign(int month, int day) {
		String sign = "";
		if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
			sign = "aquarius";
		} else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
			sign = "pisces";
		} else if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            sign = "Aries";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            sign = "Taurus";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            sign = "Gemini";
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            sign = "Cancer";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            sign = "Leo";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            sign = "Virgo";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            sign = "Libra";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            sign = "Scorpio";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            sign = "Sagittarius";
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            sign = "Capricorn";
        }
        return sign;
		
		
	}

}
