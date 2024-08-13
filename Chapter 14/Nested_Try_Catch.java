public class Nested_Try_Catch {
    public static void main(String[] args) {
        int NumberArray[] = { 10, 20, 30, 40, 50 };
        int Number_1 = 10;
        int Number_2 = 0;
        try {
            try {
                int Result = Number_1 / Number_2;

            } catch (ArithmeticException Exception) {
                System.out.println("The Following Arithmetic Exception Occurred :- " + Exception);
            }
            System.out.println(NumberArray[10]);

        } catch (ArrayIndexOutOfBoundsException Exception) {
            System.out.println("The Following ArrayIndexOutOfBounds Exception Occurred :- " + Exception);
        }
    }
}
