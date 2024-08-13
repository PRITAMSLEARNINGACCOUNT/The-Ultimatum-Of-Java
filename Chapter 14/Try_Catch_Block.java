public class Try_Catch_Block {
    public static void main(String[] args) {
        try {

            int Number_1 = 10;
            int Number_2 = 0;
            int Result = Number_1 / Number_2;
        } catch (Exception Exception) {
            System.out.println("The Following Exception Occurred :- " + Exception);
        }
    }
}
