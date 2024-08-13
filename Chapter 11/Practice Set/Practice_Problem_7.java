interface TV_remote {
    void TurnOn();

    void TurnOff();
}

interface Smart_TV_Remote {
    void TurnOn();

    void TurnOff();

    void ConnectToInternet();
}

class TV implements TV_remote {
    public void TurnOn() {
        System.out.println("TV Is Turned On");
    }

    public void TurnOff() {
        System.out.println("TV Is Turned Off");
    }
}

public class Practice_Problem_7 {
    public static void main(String[] args) {
        TV MyTV = new TV();
        MyTV.TurnOn();
        MyTV.TurnOff();
    }
}
