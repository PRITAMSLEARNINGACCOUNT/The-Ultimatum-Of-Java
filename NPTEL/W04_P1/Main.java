import java.util.Scanner; 
import java.io.System;
// import java.lang.
public class Main {
    public static void main(String[] args) {
        // Scanner object is created
        Scanner scanner = new Scanner(System.in);
        // Read String input using scanner class
        String courseName = scanner.nextLine();
        // Print the scanned String
        PrintStream out = new PrintStream();

        out.println("Course: " + courseName);
    }
}