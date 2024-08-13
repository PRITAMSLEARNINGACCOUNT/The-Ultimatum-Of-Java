abstract class MyPen {
    abstract void Write();

    abstract void Refill();
}

class FountainPen extends MyPen {
    void Write() {
        System.out.println("Pen Is Writing");
    }

    void Refill() {
        System.out.println("Pen Is Refilling");
    }

    void ChangeNib() {
        System.out.println("Changing Nib Of The Pen");
    }
}

public class Practice_Problem_2 {
    public static void main(String[] args) {
        FountainPen MyFountainPen = new FountainPen();
        MyFountainPen.Write();
        MyFountainPen.Refill();
        MyFountainPen.ChangeNib();
    }
}
