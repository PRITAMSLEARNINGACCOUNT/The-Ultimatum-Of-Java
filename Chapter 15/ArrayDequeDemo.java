import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> MyArrayDeque = new ArrayDeque<>();
        ArrayDeque<Integer> MyArrayDeque_2 = new ArrayDeque<>(3);
        MyArrayDeque.add(1);
        MyArrayDeque.add(2);
        System.out.println("My Array Deque List After Adding First Two Element - " + MyArrayDeque);
        MyArrayDeque.addFirst(50);
        System.out.println(
                "My Array Deque List After Adding An Element At First Of The Double-Ended Queue - " + MyArrayDeque);

        MyArrayDeque_2.add(3);
        MyArrayDeque_2.add(4);
        MyArrayDeque_2.add(5);
        MyArrayDeque.addAll(MyArrayDeque_2);
        System.out.println(
                "My Array List After Adding Some Extra Elements To This Array Deque List And Also Adding All Element Of Another Array Deque List - "
                        + MyArrayDeque);
        MyArrayDeque.addLast(100);
        System.out.println(
                "My Array Deque List After Adding An Element At Last Of The Double-Ended Queue - " + MyArrayDeque);

        System.out.println("Is 1 Present In My Array List ? - " + MyArrayDeque.contains(1));
        System.out.println("The Size Of The First Array List Is - " + MyArrayDeque.size());
        System.out.println("Printing The Elements Of The Array List Using For Each Loop");
        MyArrayDeque.forEach((Integer) -> System.out.println(Integer));

        MyArrayDeque.clear();
        System.out.println("Cleared The ArrayDeque Completely");
        System.out.println("So Now Is My ArrayDeque Is Empty ? - " + MyArrayDeque.isEmpty());

    }
}
