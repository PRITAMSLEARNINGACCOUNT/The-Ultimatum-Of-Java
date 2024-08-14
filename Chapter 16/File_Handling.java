import java.io.File;
import java.io.FileWriter;

public class File_Handling {
    public static void main(String[] args) {
        System.out.println("Creating A New File");
        File MyFile = new File("./DemoFileHandling.txt");
        System.out.println("File Created Successfully");
        System.out.println("File Name: " + MyFile.getName());
        System.out.println("Writing Into The File");
        try {
            FileWriter WriterFile = new FileWriter(MyFile);
            WriterFile.write("Hello World");
            WriterFile.close();
            System.out.println("Data Written Successfully");
        } catch (Exception Error) {
            System.out.println("Some Exception Occured");
            Error.printStackTrace();
        }
        System.out.println("Reading From The File");
        try {
            java.util.Scanner ReaderFile = new java.util.Scanner(MyFile);
            System.out.println("The Data In The File Is: ");
            while (ReaderFile.hasNextLine()) {
                String Data = ReaderFile.nextLine();
                System.out.println(Data);
            }
            ReaderFile.close();
        } catch (Exception Error) {
            System.out.println("Some Exception Occured");
            Error.printStackTrace();
        }
        System.out.println("Deleting The File");
        if (MyFile.delete()) {
            System.out.println("File Deleted Successfully");
        } else {
            System.out.println("Some Error Occured");
        }
    }

}