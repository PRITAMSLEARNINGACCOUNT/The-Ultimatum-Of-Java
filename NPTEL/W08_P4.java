import java.util.Scanner;

public class W08_P4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        // TEMPLATE BLOCK (Students should complete the code here)

        // TODO: Check divisibility from 2 to sqrt(number)
        // TODO: Print "Prime" if no factors are found, otherwise print "Not Prime"

        /*
         * Hints Section (Check only if you are stuck!)
         * ------------------------------------------------
         * - A number is prime if it has exactly two factors: 1 and itself
         * - Use a loop to check divisibility up to sqrt(number) to optimize performance
         */
        for (int i = 2; i < number - 1; i++) {
            if (number % i == 0) {
                System.out.println("Not Prime");
                return;
            }

        }
        System.out.println("Prime");
        scanner.close();
    }
}