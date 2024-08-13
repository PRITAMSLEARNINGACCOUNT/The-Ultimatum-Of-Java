public class Switch_Case {
    public static void main(String[] args) {
        int value = 2;
        switch (value) {
            case 1:
                System.out.println("First Switch Case Statement");
                break;
            case 2:
                System.out.println("Second Switch Case Statement");
                break;
            default:
                System.out.println("A Default Switch Case Statement");
                break;
        }

        int Value = 1;
        switch (Value) {
            case 1 ->
                System.out.println("First Switch Case Statement");
            case 2 ->
                System.out.println("Second Switch Case Statement");
            default ->
                System.out.println("A Default Switch Case Statement");
        }
    }
}
