public class Recursion {
    static int Factorial(int Number) {
        if (Number == 0) {
            return 1;
        } else {
            return Number * Factorial(Number - 1);
        }
    }

    public static void main(String[] args) {
        int Number = 5;
        int Factorial_Value = Factorial(Number);
        System.out.println("Factorial of " + Number + " is " + Factorial_Value);
    }
}
