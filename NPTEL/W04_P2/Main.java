// The following is the declaration of the main class named Main

public class Main {
    public static void main(String args[]) {
        int year; // integer type variable to store year

        // Create an object of Calendar class.
        java.util.Calendar current;

        // Use getInstance() method to initialize the Calendar object.
        current = java.util.Calendar.getInstance();// Print the current Year
        java.util.Date MyYear = current.getTime();
        year = Integer.parseInt(MyYear.toString().split(" ")[MyYear.toString().split(" ").length - 1]);
        System.out.println("Current Year: " + year);

    }
}