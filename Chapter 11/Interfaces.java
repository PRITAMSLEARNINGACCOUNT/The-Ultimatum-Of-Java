interface Animal {
    void eat();

    void travel();
}

class Dog implements Animal {
    public void eat() {
        System.out.println("Dog eats");
    }

    public void travel() {
        System.out.println("Dog travels");
    }

    public void bark() {
        System.out.println("Dog barks");
    }

}

interface Bycycle {
    String Model = "Honda";

    void IncreaseSpeed(int increment);

    void DecreaseSpeed(int decrement);

    default void GetBycyleModel() {
        System.out.println("Bycycle Model: " + Model);
    }
}

class HondaMotorCycle implements Bycycle {
    int speed = 0;

    public void IncreaseSpeed(int increment) {
        speed += increment;
    }

    public void DecreaseSpeed(int decrement) {
        speed -= decrement;
    }

    public int getBycycleSpeed() {
        return speed;
    }
}

interface DSLR {
    void takePhoto();

    void recordVideo();
}

class VIVOPhone implements DSLR {
    public void GPS() {
        System.out.println("VIVO Phone Has GPS Connectivity Feature");
    }

    public void takePhoto() {
        System.out.println("SmartPhone Is Taking A Photo");
    }

    public void recordVideo() {
        System.out.println("SmartPhone Is Recording A Video");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Dog MyDog = new Dog();
        MyDog.eat();
        MyDog.travel();
        MyDog.bark();

        HondaMotorCycle MyBycycle = new HondaMotorCycle();
        MyBycycle.getBycycleSpeed();
        MyBycycle.IncreaseSpeed(10);
        System.out.println("Bycycle Speed After Increasing Is - " + MyBycycle.getBycycleSpeed());
        MyBycycle.DecreaseSpeed(5);
        System.out.println("Bycycle Speed After Decreasing Is - " + MyBycycle.getBycycleSpeed());

        DSLR MyVIVOPhone = new VIVOPhone();
        MyVIVOPhone.takePhoto();
        MyVIVOPhone.recordVideo();
        // MyVIVOPhone.GPS(); --> This will give an error as GPS() is not a part of DSLR Interface


    }
}
