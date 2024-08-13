abstract class TelePhone {
    abstract void ring();

    abstract void lift();

    abstract void disconnect();
}

class SmartTelephone extends TelePhone {
    void ring() {
        System.out.println("Ringing");
    }

    void lift() {
        System.out.println("Lifting");
    }

    void disconnect() {
        System.out.println("Disconnecting");
    }

    void takePhoto() {
        System.out.println("Taking Photo");
    }

    void playMusic() {
        System.out.println("Playing Music");
    }
}

public class Practice_Problem_4 {
    public static void main(String[] args) {
        System.out.println("Demonstrating Polymorphism By Using SmartTelephone As A Telephone");
        TelePhone MySmartTelephone = new SmartTelephone();
        MySmartTelephone.ring();
        MySmartTelephone.lift();
        MySmartTelephone.disconnect();
        System.out.println("Demonstrating Polymorphism By Using SmartTelephone As A SmartTelephone");
        SmartTelephone MySmartTelephone2 = new SmartTelephone();
        MySmartTelephone2.takePhoto();
        MySmartTelephone2.playMusic();
        MySmartTelephone2.ring();
        MySmartTelephone2.lift();
        MySmartTelephone2.disconnect();


    }
}
