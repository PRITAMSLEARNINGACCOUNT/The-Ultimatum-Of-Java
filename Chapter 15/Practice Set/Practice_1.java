import java.util.ArrayList;
import java.util.Objects;

public class Practice_1 {
    public static void main(String[] args) {
        ArrayList<String> Students = new ArrayList<String>();
        Students.add("PRITAM SAHA");
        Students.add("MOTKA");
        Students.add("MUKTI");
        Students.add("DEBANGANA ROY");
        Students.add("SWATI MADDUNEY");
        Students.add("DEB KUMAR MONDAL");
        Students.add("GOURSUNDAR GHOSH");
        Students.add("RIYA DEY");
        Students.add("SOUDEEPTA BHATTACHARJEE");
        Students.add("MOUBANI BASU");
        System.out.println("Printing Students Names:");
        for (String Student : Students) {
            System.out.println(Student);
        }
        // Testing Part Not Included In The Question
        // ArrayList<Integer> TemporaryNumbers = new ArrayList<Integer>();
        // TemporaryNumbers.add(1);
        // TemporaryNumbers.add(2);
        // for (Object TemporaryNumber : TemporaryNumbers) {
        //     System.out.println(TemporaryNumber);
        // }

    }
}
