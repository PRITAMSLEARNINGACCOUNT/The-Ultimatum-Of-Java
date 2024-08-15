import java.io.FileWriter;

public class Practice_Program_06 {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            try {
                FileWriter Writer = new FileWriter("MultiplicationTable 0" + i + ".txt");
                for (int j = 1; j <= 10; j++) {
                    Writer.write(i + " x " + j + " = " + i * j + "\n");
                }
                Writer.close();
            } catch (Exception Error) {
                Error.printStackTrace();
            }
        }
        System.out.println("Multiplication Tables Generated Successfully!");
    }
}



