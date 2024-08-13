public class Throws_Keywords {
    public static double SquareArea(double Side) throws ArithmeticException {
        if (Side < 0) {
            throw new ArithmeticException("Side cannot be negative");
        }
        return Side * Side;
    }

    public static void main(String[] args) {
        try {
            System.out.println(SquareArea(-1));
        } catch (Exception Error) {
            System.out.println(Error);
        }
        System.out.println("The Area Of A Square With Side " + 5 + " Is " + SquareArea(5));

    }
}
