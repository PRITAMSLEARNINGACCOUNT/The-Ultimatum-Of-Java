import java.util.Scanner;

class MyException_2 extends Exception {
    @Override
    public String toString() {
        return "Maximum Retries Or Attempts Exceeded";
    }
}

public class Practice_5 {
    public static void Question_5() throws MyException_2 {
        int Array[] = {1, 2, 3, 4, 5};
        Scanner Input = new Scanner(System.in);
        // boolean ExceedAttempts = true;
        int CountAttempt = 0;
        while (true) {
            System.out.println("Please Enter The Index To Be Accessed From The Array ??");
            int Index = Input.nextInt();
            try {
                System.out.println("The Value At " + Index + " Is - " + Array[Index]);
            } catch (ArrayIndexOutOfBoundsException Exception) {
                System.out.println("Invalid Index");
            }
            if (CountAttempt == 4) {
                throw new MyException_2();
            }
            CountAttempt++;
        }

    }

    public static void main(String[] args) {
        try {
            Question_5();

        } catch (MyException_2 Exception) {
            System.out.println(Exception);
        }
    }
}
