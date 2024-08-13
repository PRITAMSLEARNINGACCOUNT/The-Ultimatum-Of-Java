class Phone {
    public void Call() {
        System.out.println("Calling From Phone...");
    }

    public void SMS() {
        System.out.println("Sending SMS From Phone...");
    }
}

class SmartPhone extends Phone {
    @Override
    public void Call() {
        System.out.println("Calling From Smartphone...");
    }

    public void Camera() {
        System.out.println("Capturing From Smartphone...");
    }

    public void Music() {
        System.out.println("Playing Music From Smartphone...");
    }
}

public class Dynamic_Method_Dispatch {

    public static void main(String[] args) {
        Phone Object = new SmartPhone();
        Object.Call();
        Object.SMS();
        // Object.Camera(); // Produce An Error
        // Object.Music(); // Produce An Error
    }
}