class CellPhone {
    public void Ring() {
        System.out.println("Ringing...");
    }

    public void Vibrate() {
        System.out.println("Vibrating...");
    }
}

public class Practice_2 {
    public static void main(String[] args) {
        CellPhone MyCellPhone = new CellPhone();
        MyCellPhone.Ring();
        MyCellPhone.Vibrate();

    }
}
