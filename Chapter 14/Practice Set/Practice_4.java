import java.util.Scanner;

class MyException extends Exception {
    @Override
    public String toString() {
        return "Maximum Retries Or Attempts Exceeded";
    }
}

public class Practice_4 {
    public static void main(String[] args) {
        int Array[] = {1, 2, 3, 4, 5};
        Scanner Input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Please Enter The Index To Be Accessed From The Array ??");
                int Index = Input.nextInt();
                System.out.println("The Value At " + Index + " Is - " + Array[Index]);
                return;

            } catch (ArrayIndexOutOfBoundsException Exception) {
                System.out.println("Invalid Index");
            }
        }
        try {
            throw new MyException();
        } catch (MyException Exception) {
            System.out.println(Exception);
        }
    }
}
