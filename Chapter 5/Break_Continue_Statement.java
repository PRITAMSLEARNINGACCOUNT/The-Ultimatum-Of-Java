public class Break_Continue_Statement {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(
                    "I Am Under A For Loop Which Is Supposed To Run For 5 Times But It Will Break At 3rd Time");
        }

        int j = 0;
        while (j < 5) {
            if (j == 3) {
                j++;
                continue;
            }
            System.out.println("I Am Under A While Loop Which Is Running For 5 Times Just Skipping The Third Time");
            j++;
        }

        int k = 0;
        do {
            if (k == 3) {
                k++;
                continue;
            }
            System.out.println(
                    "I Am Under A Do-While Loop Which Is Running For 5 Times But Here I Am Also Skipping The Third Time");
            k++;
        } while (k < 5);
    }
}
