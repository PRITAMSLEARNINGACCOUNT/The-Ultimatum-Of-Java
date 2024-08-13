import java.util.Scanner;

public class Practice_5 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int Element_Number;
        System.out.println("Enter The Number Elements You Want In An Array : - ");
        Element_Number = Input.nextInt();
        int[] Array = new int[Element_Number];
        for (int i = 0; i < Array.length; i++) {
            System.out.print("Enter The Value Of The Element No " + (i + 1) + ": ");
            Array[i] = Input.nextInt();
        }
       /* A Simplest Way To Only Print A Reverse Array
        System.out.println("So The Reverse Of The Array Is : - ");
        for (int i = Array.length - 1; i >= 0; i--) {
            System.out.print(Array[i] + " ");
        }
        By Creating A Temporary Array And Printing The Temporary Array As A Reverse Array
        int[] TemporaryArray = new int[Element_Number];
        int J = 0;
        for (int i = Array.length - 1; i >= 0; i--) {
            TemporaryArray[J] = Array[i];
            J++;
        }
        System.out.println("So The Reverse Of The Array Is : - ");
        for (int i = 0; i < TemporaryArray.length; i++) {
            System.out.print(TemporaryArray[i] + " ");
        }
        By Creating A Temporary Array And Swapping The Elements Of The Array From The Temporary Array To The Main Array
        And Printing The Main Array As A Reverse Array - So Here I Am Actually Replacing The Main Array To Make It A
        Reverse Array
        int[] TemporaryArray = new int[Element_Number];
        int J = 0;
        for (int i = Array.length - 1; i >= 0; i--) {
            TemporaryArray[J] = Array[i];
            J++;
        }
        for (int i = 0; i < Array.length; i++) {
            Array[i] = TemporaryArray[i];
        }
        System.out.println("So The Reverse Of The Array Is : - ");
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        */
        // By Swapping The Elements Of The Array Without Creating A Temporary Array - Recommended And Most Efficient Way To Make A Reverse Array
        for (int i = 0; i < Array.length / 2; i++) {
            int Temporary = Array[i];
            Array[i] = Array[Array.length - 1 - i];
            Array[Array.length - 1 - i] = Temporary;
        }
        System.out.println("So The Reverse Of The Array Is : - ");
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }

    }

}

