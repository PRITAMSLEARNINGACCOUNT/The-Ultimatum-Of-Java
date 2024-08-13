public class Introduction_To_Arrays {
    public static void main(String[] args) {
        int[] Array_1 = new int[3];
        String[] Array_2;
        Array_2 = new String[3];
        Float[] Array_3 = { 0.54f, 4.44f, 19.8f };
        byte[] Array_4 = new byte[3];
        char[] Array_5 = new char[3];
        boolean[] Array_6 = new boolean[3];
        double[] Array_7 = new double[3];
        long[] Array_8 = new long[3];
        short[] Array_9 = new short[3];
        Array_1[0] = 1;
        Array_1[1] = 10;
        Array_1[2] = 198;
        Array_2[0] = "PRITAM SAHA";
        Array_2[1] = "MUTKI ROY";
        Array_2[2] = "SAYAN SAHA";
        Array_4[0] = 1;
        Array_4[1] = 10;
        Array_5[2] = 'A';
        Array_5[0] = 'B';
        Array_5[1] = 'C';
        Array_6[2] = true;
        Array_6[0] = false;
        Array_6[1] = true;
        Array_7[2] = 10.064;
        Array_7[2] = 65.44;
        Array_7[2] = 997.445;
        Array_8[2] = 10000000;
        Array_8[2] = 7000000;
        Array_8[2] = 654465470;
        Array_9[2] = 9;
        Array_9[2] = 7;
        Array_9[2] = 65;
        System.out.println("Printing The Array Of Integers: ");
        System.out.println(Array_1[0] + Array_1[1] + Array_1[2]);
        System.out.println("Printing The Array Of Strings: ");
        System.out.println(Array_2[0] + Array_2[1] + Array_2[2]);
        System.out.println("Printing The Array Of Floats: ");
        System.out.println(Array_3[0] + Array_3[1] + Array_3[2]);
        System.out.println("Printing The Array Of Bytes: ");
        System.out.println(Array_4[0] + Array_4[1] + Array_4[2]);
        System.out.println("Printing The Array Of Chars Using Traditional For Loop: ");
        for (int i = 0; i < Array_5.length; i++) {
            System.out.println(Array_5[i]);
        }
        System.out.println("Printing The Array Of Booleans: ");
        System.out.println(Array_6[0]);
        System.out.println(Array_6[1]);
        System.out.println(Array_6[2]);
        System.out.println(Array_7[0] + Array_7[1] + Array_7[2]);
        System.out.println(Array_8[0] + Array_8[1] + Array_8[2]);
        System.out.println(Array_9[0] + Array_9[1] + Array_9[2]);

    }
}