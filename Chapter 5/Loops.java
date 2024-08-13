public class Loops {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("I Am Under A For Loop Which Is Running For 5 Times");
        }

        int j = 0;
        while (j < 5) {
            System.out.println("I Am Under A While Loop Which Is Running For 5 Times");
            j++;

        }

        int k = 0;
        do {
            System.out.println("I Am Under A Do-While Loop Which Is Running For 5 Times");
            k++;
        } while (k < 5);
    }
}