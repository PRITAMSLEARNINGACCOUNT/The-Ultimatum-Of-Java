import java.util.Scanner;

public class Practice_8 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int ElementNo;
        System.out.println("Enter The Number Of Value You Want To Store In The Array : ");
        ElementNo = Input.nextInt();
        int[] Array = new int[ElementNo];
        for (int i = 0; i < Array.length; i++) {
            System.out.print("Enter The Value At Index " + (i + 1) + ": ");
            Array[i] = Input.nextInt();
        }


        int MIN = Array[0];
        boolean IsSorted = true;
        for (int Element : Array) {
            if (Element < MIN) {
                IsSorted = false;
                break;
            }
        }
        if (IsSorted) {
            System.out.println("The Array Is Sorted");
        } else {
            System.out.println("The Array Is Not Sorted");
        }
        /* Alternative Method To Find out Whether The Array Is Sorted Or Not
        boolean IsSorted = true;
        for (int i = 0; i < Array.length - 1; i++) {
            if (Array[i] > Array[i + 1]) {
                IsSorted = false;
                break;
            }
        }
        if (IsSorted) {
            System.out.println("The Array Is Sorted");
        } else {
            System.out.println("The Array Is Not Sorted");
        }
        */
    }
}
