public class Handling_Specific_Exceptions {
    public static void main(String[] args) {
        int NumberArray[] = { 10, 20, 30, 40, 50 };
        try {
            // System.out.println(NumberArray[10]);
            int Number_1 = 10;
            int Number_2 = 0;
            int Result = Number_1 / Number_2;
        } catch (ArrayIndexOutOfBoundsException Exception) {
            System.out.println("The Following Exception Occurred :- " + Exception);
        } catch (ArithmeticException Exception) {
            System.out.println("The Following Exception Occurred :- " + Exception);
        }
    }
}