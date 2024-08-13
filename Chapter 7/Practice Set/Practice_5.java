public class Practice_5 {
    static int CalculateFibonacci(int N) {
        if (N == 1) {
            return 0;
        } else if (N == 2) {
            return 1;
        }
        return CalculateFibonacci(N - 1) + CalculateFibonacci(N - 2);
    }

    public static void main(String[] args) {
        System.out.println("Please Enter The Value Of N To Calculate The Nth Fibonacci Number: ");
        java.util.Scanner Input = new java.util.Scanner(System.in);
        int N = Input.nextInt();
        System.out.println("The " + N + "th Fibonacci Number Is: " + CalculateFibonacci(N));
    }
}
