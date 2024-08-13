import java.util.Scanner;

public class Quick_Quiz {
    public static void main(String[] args) {
        int Array[] = { 10, 20, 30, 40, 50 };
        Scanner Input = new Scanner(System.in);
        do {
            System.out.println("Enter The Index Of The Array: ");
            int Index = Input.nextInt();
            try {
                System.out.println("The Value At Index " + Index + " Is " + Array[Index]);
                break;
            } catch (ArrayIndexOutOfBoundsException Error) {
                System.out.println(Error);
            }

        } while (true);

    }
}
