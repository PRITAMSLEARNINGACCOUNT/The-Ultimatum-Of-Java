import java.util.Scanner;

// Class to store and process an array of numbers
class NumberArray {
    private int[] numbers; // This array will store the numbers given by the user

    // Constructor to initialize the array
    public NumberArray(int[] numbers) {
        this.numbers = numbers;
    }

    public int getMax() {
        int num1 = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (num1 < numbers[i]) {
                num1 = numbers[i];
            }
        }
        return num1;
    }

    public int getMin() {
        int num1 = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (num1 > numbers[i]) {
                num1 = numbers[i];
            }
        }
        return num1;
    }
}

public class W07_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read 5 integers from the user and store them in an array
        int[] arr = new int[5]; // Create an array of size 5
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt(); // Read numbers from user
        }

        // Create an instance of NumberArray and print max & min values
        NumberArray numArray = new NumberArray(arr);
        System.out.println("Max: " + numArray.getMax() + ", Min: " + numArray.getMin());

        scanner.close(); // Close scanner to free resources
    }
}
