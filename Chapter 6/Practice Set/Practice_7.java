import java.util.Scanner;

public class Practice_7 {
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
        for (int Element : Array) {
            if (Element < MIN) {
                MIN = Element;
            }
        }
        System.out.println("The Minimum Value In The Array Is: " + MIN);

        /* Alternative Method To Find The Maximum Value In The Array
        int MIN = Integer.MAX_VALUE;
        for (int Element : Array) {
            if (Element < MIN) {
                MIN = Element;
            }
        }
        System.out.println("The Minimum Value In The Array Is: " + MIN);
        */

    }
}
