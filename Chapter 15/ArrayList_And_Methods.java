import java.util.ArrayList;

public class ArrayList_And_Methods {
    public static void main(String[] args) {
        ArrayList<Integer> MyArrayList = new ArrayList<>();
        ArrayList<Integer> MyArrayList_2 = new ArrayList<>(3);
        MyArrayList.add(1);
        MyArrayList.add(2);
        System.out.println("My Array List After Adding First Two Element - " + MyArrayList);
        MyArrayList.add(1, 50);
        System.out.println("My Array List After Adding An Element At Index 1 - " + MyArrayList);
        MyArrayList.set(2, 500);
        System.out.println("My Array List After Replacing An Element On Index 2 - " + MyArrayList);
        MyArrayList_2.add(3);
        MyArrayList_2.add(4);
        MyArrayList_2.add(5);
        MyArrayList.addAll(MyArrayList_2);
        System.out.println(
                "My Array List After Adding Some Extra Elements To This Array List And Also Adding All Element Of Another Array List - "
                        + MyArrayList);

        System.out.println("Is 1 Present In My Array List ? - " + MyArrayList.contains(1));
        System.out.println("The Size Of The First Array List Is - " + MyArrayList.size());
        System.out.println("The Element At Index 2 Is - " + MyArrayList.get(2));
        MyArrayList.add(5);
        System.out.println("The First Index Of 5 Is - " + MyArrayList.indexOf(5));
        System.out.println("The Last Index Of 5 Is - " + MyArrayList.lastIndexOf(5));
        System.out.println("Printing The Elements Of The Array List Using For Each Loop");
        MyArrayList.forEach((Integer) -> System.out.println(Integer));

        MyArrayList.clear();
        System.out.println("Cleared The ArrayList Completely");
        System.out.println("So Now Is My ArrayList Is Empty ? - " + MyArrayList.isEmpty());
    }
}