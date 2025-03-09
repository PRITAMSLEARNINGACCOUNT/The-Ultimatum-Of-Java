import java.util.Scanner;

public class W08_P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TEMPLATE BLOCK (Students should complete the code here)

        // TODO: Initialize a variable to store the factorial result
        // TODO: Use a loop to multiply numbers from 1 to n
        // TODO: Print the calculated factorial

        /*
         * Hints Section (Check only if you are stuck!)
         * ------------------------------------------------
         * - Use a loop from 1 to n and multiply the numbers
         * - If n is 0, return 1 (by definition of factorial)
         */
        int factorial = 1;
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            factorial*=i;
        }
        System.out.println(factorial);
        scanner.close();
    }
}
