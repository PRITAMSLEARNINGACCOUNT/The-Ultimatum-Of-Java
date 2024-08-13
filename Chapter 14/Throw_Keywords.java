public class Throw_Keywords {
    public static void main(String[] args) {
        int Value = 10;
        if (Value == 10) {
            try {
                throw new ArithmeticException();

            } catch (Exception Error) {
                System.out.println(Error);
            }
            System.out.println("Program is still running");
        }
    }
}