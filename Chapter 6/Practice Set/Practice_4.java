import java.util.Scanner;

public class Practice_4 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int[][] Matrix_1 = new int[2][3];
        int[][] Matrix_2 = new int[2][3];
        int[][] Sum = new int[2][3];
        System.out.println("Enter The Values For Matrix One - ");
        for (int i = 0; i < Matrix_1.length; i++) {
            System.out.println("Enter The Values For Row " + (i + 1) + " - ");
            for (int j = 0; j < Matrix_1[i].length; j++) {
                System.out.print("Enter The Value For Column " + (j + 1) + ": ");
                Matrix_1[i][j] = Input.nextInt();
            }
        }
        System.out.println("The Values Of Matrix One Is - ");
        for (int i = 0; i < Matrix_1.length; i++) {
            for (int j = 0; j < Matrix_1[i].length; j++) {
                System.out.print(Matrix_1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter The Values For Matrix Two - ");
        for (int i = 0; i < Matrix_2.length; i++) {
            System.out.println("Enter The Values For Row " + (i + 1) + " - ");
            for (int j = 0; j < Matrix_2[i].length; j++) {
                System.out.print("Enter The Value For Column " + (j + 1) + ": ");
                Matrix_2[i][j] = Input.nextInt();
            }
        }
        System.out.println("The Values Of Matrix Two Is - ");
        for (int i = 0; i < Matrix_2.length; i++) {
            for (int j = 0; j < Matrix_2[i].length; j++) {
                System.out.print(Matrix_2[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < Matrix_2.length; i++) {
            for (int j = 0; j < Matrix_2[i].length; j++) {
                Sum[i][j] = Matrix_1[i][j] + Matrix_2[i][j];
            }
        }
        System.out.println("The Sum Of The Two Matrices Is - ");
        for (int i = 0; i < Sum.length; i++) {
            for (int j = 0; j < Sum[i].length; j++) {
                System.out.print(Sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
