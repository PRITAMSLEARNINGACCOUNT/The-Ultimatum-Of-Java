public class Arithmetic_Operations_Between_Different_Data_Types {
    public static void main(String[] args) {
        byte num1 = 10;
        short num2 = 20;
        int num3 = num1 + num2;
        System.out.println("Arithmetic operation between byte and short into int " + num3);
        int num4 = num2 + 4;
        System.out.println("Arithmetic operation between short and int into int " + num4);
        long num5 = 45;
        float num6 = 45.5f;
        float num7 = num5 + num6;
        System.out.println("Arithmetic operation between long and float into float " + num7);
        float num8 = 5 + num6;
        System.out.println("Arithmetic operation between int and float into float " + num8);
        int Result = 'A' + 5;
        System.out.println("Arithmetic operation between char and int into int " + Result);
        int Result_2 = 'A' + num2;
        System.out.println("Arithmetic operation between char and short into int " + Result_2);
        double Result_3 = 5.5 + num5;
        System.out.println("Arithmetic operation between double and long into double " + Result_3);
        double Result_4 = 5.5 + num6;
        System.out.println("Arithmetic operation between double and float into double " + Result_4);

    }

}
