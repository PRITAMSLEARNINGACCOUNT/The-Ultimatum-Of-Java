interface GPS {
    void turnOn();

    void turnOff();
}

interface Camera {
    void takePicture();

    void recordVideo();
}

interface MediaPlayer {
    void playMusic();

    void playVideo();
}

class MyPhone {
    void call() {
        System.out.println("Calling...");
    }

    void sms() {
        System.out.println("Sending SMS...");
    }
}

class MySmartMyPhone extends MyPhone implements GPS, Camera, MediaPlayer {
    @Override
    public void turnOn() {
        System.out.println("GPS is on");
    }

    @Override
    public void turnOff() {
        System.out.println("GPS is off");
    }

    @Override
    public void takePicture() {
        System.out.println("Taking picture...");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video...");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music...");
    }

    @Override
    public void playVideo() {
        System.out.println("Playing video...");
    }
}

public class Polymorphism_With_Interfaces {
    public static void main(String[] args) {
        System.out.println("Demonstrating All Methods");
        MySmartMyPhone mySmartMyPhone = new MySmartMyPhone();
        mySmartMyPhone.call();
        mySmartMyPhone.sms();
        mySmartMyPhone.turnOn();
        mySmartMyPhone.turnOff();
        mySmartMyPhone.takePicture();
        mySmartMyPhone.recordVideo();
        mySmartMyPhone.playMusic();
        mySmartMyPhone.playVideo();
        System.out.println("Demonstrating Polymorphism with Interfaces");
        System.out.println("Using My SmartPhone As GPS Device");
        GPS GPSDevice = new MySmartMyPhone();
        GPSDevice.turnOn();
        GPSDevice.turnOff();
        System.out.println("Using My SmartPhone As Camera Device");
        Camera cameraDevice = new MySmartMyPhone();
        cameraDevice.takePicture();
        cameraDevice.recordVideo();
        System.out.println("Using My SmartPhone As Normal Keypad Device");
        MyPhone MyKeypadPhone = new MySmartMyPhone();
        MyKeypadPhone.call();
        MyKeypadPhone.sms();


    }
}
