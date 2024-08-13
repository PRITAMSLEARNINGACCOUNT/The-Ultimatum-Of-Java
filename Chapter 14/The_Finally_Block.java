public class The_Finally_Block {
    public static void FinallyDemonstration(int Parameter) {
        if (Parameter == 0) {
            try {
                System.out.println("Parameter Cannot Be Zero.....Returning The Function");
                return;
            } finally {
                System.out.println("Finally Block Executed Even After Returning The Function From The Try Block");
            }
        }

    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Executing Try Block And Breaking The Loop Immediately In The First Iteration");
                break;
            } finally {
                System.out.println("Executing The Finally block");
            }
        }
        FinallyDemonstration(0);

    }
}
