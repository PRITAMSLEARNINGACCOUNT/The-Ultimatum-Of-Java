import java.util.Scanner;

public class Practice_6 {
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

        int MAX = Integer.MIN_VALUE;
        for (int Element : Array) {
            if (Element > MAX) {
                MAX = Element;
            }
        }
        System.out.println("The Maximum Value In The Array Is: " + MAX);

        /* Alternative Method To Find The Maximum Value In The Array
        int MAX = Array[0];
        for (int Element : Array) {
            if (Element > MAX) {
                MAX = Element;
            }
        }
        System.out.println("The Maximum Value In The Array Is: " + MAX);
        */

    }
}
