// Code made by Alejandro Fernandez Patraca
import java.util.Scanner;


public class DateAndTimeTester {

    // handles all user input and interactions, called by the driver.
    public void run() {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("Enter a date and time (MM/DD hh:mm) and I will determine if it is valid");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("quit")) {
                break;
            }
            if (isValid(input)) {
                System.out.println("The date and time is valid!");
            } else {
                System.out.println("The date and time is invalid.");
            }
            System.out.println("Would you like to exit? Type 'quit' to exit or press [ENTER] to continue.");
        }
        scanner.close();
    }

    // This checks if a given date and time string is valid.
    public boolean isValid(String dateTime) {
        String[] parts = dateTime.split(" ");
        if (parts.length != 2) return false;
        return isValidDate(parts[0]) && isValidTime(parts[1]);
    }

    // This checks if a given date string is valid.
    public boolean isValidDate(String date) {
        int month = getMonth(date);
        int day = getDay(date);
        if (month < 1 || month > 12 || day < 1 || day > 31) return false;
        if (month == 2 && day > 28) return false; // February check
        if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) return false; // 30-day months check
        return true;
    }

    // This checks if a given time string is valid.
    public boolean isValidTime(String time) {
        int hour = getHour(time);
        int minute = getMinute(time);
        return hour >= 1 && hour <= 12 && minute >= 0 && minute <= 59;
    }

    // This returns the month from a date string.
    public int getMonth(String date) {
        String[] parts = date.split("/");
        if (parts.length != 2) return -1;
        return Integer.parseInt(parts[0]);
    }

    // This returns the day from a date string.
    public int getDay(String date) {
        String[] parts = date.split("/");
        if (parts.length != 2) return -1;
        return Integer.parseInt(parts[1]);
    }

    // This returns the hour from a time string.
    public int getHour(String time) {
        String[] parts = time.split(":");
        if (parts.length != 2) return -1;
        return Integer.parseInt(parts[0]);
    }

    // This returns the minute from a time string.
    public int getMinute(String time) {
        String[] parts = time.split(":");
        if (parts.length != 2) return -1;
        return Integer.parseInt(parts[1]);
    }
}
