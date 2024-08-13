import java.util.HashSet;

public class Practice_5 {
    public static void main(String[] args) {
        HashSet<Integer> MySet = new HashSet<>();
        MySet.add(1);
        MySet.add(2);
        MySet.add(1);
        System.out.println("Created Set Is  - " + MySet);
        System.out.println("As You Can See That Duplicate Values Are Not Allowed In Set");
    }
}
