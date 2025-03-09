import java.util.Scanner;

public class W07_5 {
    private String password;

    // Step 1: Constructor to initialize the password variable
    public W07_5(String password) {
        this.password = password; // Assign the passed password to the instance variable
    }

    boolean hasUpperCase = false;
    boolean hasDigit = false;

    boolean isValidPassword(String password) {
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true; // Found an uppercase letter
            }
            if (Character.isDigit(ch)) {
                hasDigit = true; // Found a number
            }

            if (hasDigit && hasUpperCase) {
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read password input from user
        String inputPassword = scanner.nextLine();
        scanner.close();
        W07_5 validator = new W07_5(inputPassword);

        // Check password validity and print result
        if (validator.isValidPassword(inputPassword)) {
            System.out.print("Valid Password");
        } else {
            System.out.print("Invalid Password");
        }

        scanner.close();
    }
}