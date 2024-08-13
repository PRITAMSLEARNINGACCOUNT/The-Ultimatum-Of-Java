import java.util.HashSet;

public class HashSetDemo extends HashSet<Integer> {

    public static void main(String[] args) {
        HashSet<Integer> MyHashSet = new HashSet<>();
        MyHashSet.add(1);
        // Can't Add Duplicate Elements In HashSet
        // MyHashSet.add(1);
        // MyHashSet.add(1);
        // MyHashSet.add(1);
        System.out.println("My Hash Set After Adding First Element - " + MyHashSet);

        MyHashSet.add(10);
        MyHashSet.add(11);
        MyHashSet.add(21);
        System.out.println(1 % 10);
        System.out.println(10 % 10);
        System.out.println(11 % 10);
        System.out.println(21 % 10);
        System.out.println("My Hash Set After Adding Some More Elements - " +
                MyHashSet);

    }
}