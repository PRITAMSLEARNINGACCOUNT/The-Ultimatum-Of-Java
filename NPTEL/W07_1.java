import java.util.Scanner;

class W07_1 {
    private int num1;
    private int num2;

    W07_1(int a, int b) {
        num1 = a;
        num2 = b;
    }

    int add() {
        return this.num1 + this.num2;
    }

    int subtract() {
        return this.num1 - this.num2;
    }

    int multiply() {
        return this.num1 * this.num2;
    }

    int divide() {
        if (this.num2 == 0) {
            return 0;
        }
        return this.num1 / this.num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        W07_1 calc = new W07_1(a, b);
        System.out.println("Sum: " + calc.add());
        System.out.println("Difference: " + calc.subtract());
        System.out.println("Product: " + calc.multiply());
        System.out.println("Quotient: " + calc.divide());

        scanner.close();
    }
}