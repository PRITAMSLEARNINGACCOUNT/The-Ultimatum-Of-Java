public class Practice_7 {
    public static void main(String[] args) {
        int i = 4;
        while (i > 0) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.print("\n");
            i--;
        }
    }
}
