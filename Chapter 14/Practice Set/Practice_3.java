import java.util.Scanner;

public class Practice_3 {
    public static void main(String[] args) {
        int Array[] = {1, 2, 3, 4, 5};
        Scanner Input = new Scanner(System.in);
        int Attempts = 0;
        do {

            try {
                if (Attempts == 5) {
                    System.out.println("Error");
                    break;
                }
                Attempts++;
                System.out.println("Please Enter The Index To Be Accessed From The Array ??");
                int Index = Input.nextInt();
                System.out.println("The Value At " + Index + " Is - " + Array[Index]);

            } catch (ArrayIndexOutOfBoundsException Exception) {
                System.out.println("Invalid Index");
            }
        } while (true);
    }
}
