import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> MyLinkedList = new LinkedList<>();
        MyLinkedList.add(1);
        MyLinkedList.add(2);
        System.out.println("My Linked List After Adding First Two Element - " + MyLinkedList);
        MyLinkedList.addLast(20);
        System.out.println("My Linked List After Adding An Element At Last - " + MyLinkedList);
        MyLinkedList.clear();
        System.out.println("Cleared The LinkedList Completely");
        System.out.println("So Now Is My LinkedList Is Empty ? - " + MyLinkedList.isEmpty());
    }
}
