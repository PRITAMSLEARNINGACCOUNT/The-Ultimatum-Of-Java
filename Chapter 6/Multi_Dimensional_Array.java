import java.util.Scanner;

public class Multi_Dimensional_Array {

    public static void main(String[] args) {
        int[][] MD_Array = new int[3][3];
        // System.out.println("Length of the array: " + MD_Array.length);
        Scanner Input = new Scanner(System.in);
        for (int i = 0; i < MD_Array.length; i++) {
            for (int j = 0; j < MD_Array[1].length; j++) {
                System.out.println("Enter The Value For MD Array [" + i + "][" + j + "]: ");
                MD_Array[i][j] = Input.nextInt();
            }
        }
        System.out.println("Now Printing The Multi-Dimensional Array: ");
        for (int i = 0; i < MD_Array.length; i++) {
            for (int j = 0; j < MD_Array[1].length; j++) {
                System.out.print(MD_Array[i][j] + " ");
            }
            System.out.print("\n");
        }

    }
}
