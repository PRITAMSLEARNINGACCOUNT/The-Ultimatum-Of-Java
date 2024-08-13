import java.util.Scanner;

public class Practice_2 {
    public static void Division(String Num_1, String Num_2) {
        int Number_1;
        int Number_2;

        try {
            Number_1 = Integer.parseInt(Num_1);
            Number_2 = Integer.parseInt(Num_2);
            try {
                System.out.println(Number_1 / Number_2);

            } catch (ArithmeticException Exception) {
                System.out.println("HaHa");
            }
        } catch (IllegalArgumentException Exception) {
            System.out.println("HeHe");
        }


    }

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Please Enter The First Number For Division ??");
        String StringNum_1 = Input.next();
        System.out.println("Please Enter The Second Number For Division ??");
        String StringNum_2 = Input.next();
        Division(StringNum_1, StringNum_2);
    }
}
