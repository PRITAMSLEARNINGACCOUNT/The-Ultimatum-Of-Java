abstract class PhoneStructure {
    abstract void MakeCall();

    abstract void MakeMessage();

    abstract void SwitchOn();

    abstract void SwitchOff();

}

class Phone extends PhoneStructure {
    void GetPhoneModel() {
        System.out.println("Phone Model: Keypad OLD Phone Nokia");
    }

    void MakeCall() {
        System.out.println("Making a call");
    }

    void MakeMessage() {
        System.out.println("Sending a message");
    }

    void SwitchOn() {
        System.out.println("Switching on the phone");
    }

    void SwitchOff() {
        System.out.println("Switching off the phone");
    }
}

class SmartPhone extends PhoneStructure {
    void GetPhoneModel() {
        System.out.println("Phone Model: Samsung Galaxy S10");
    }

    void MakeCall() {
        System.out.println("Making a call");
    }

    void MakeMessage() {
        System.out.println("Sending a message");
    }

    void SwitchOn() {
        System.out.println("Switching on the phone");
    }

    void SwitchOff() {
        System.out.println("Switching off the phone");
    }
}

public class Absract_Classes_With_Abstract_Methods {
    public static void main(String[] args) {
        System.out.println("Demonstrating Phone Class Methods Via Implementing Abstract Class With Abstract Methods In This Phone Class");
        Phone MyPhone = new Phone();
        MyPhone.GetPhoneModel();
        MyPhone.MakeCall();
        MyPhone.MakeMessage();
        MyPhone.SwitchOn();
        MyPhone.SwitchOff();
        System.out.println("Demonstrating SmartPhone Class Methods Via Creating A Reference Of PhoneStructure Abstract Class");
        PhoneStructure MyPhone2 = new SmartPhone();
        // MyPhone2.GetPhoneModel(); --> This will give an error as GetPhoneModel() is not defined in the abstract class And We Are Making An Object Of SmartPhone Class With The Reference Of PhoneStructure Class
        MyPhone2.MakeCall();
        MyPhone2.MakeMessage();
        MyPhone2.SwitchOn();
        MyPhone2.SwitchOff();

    }
}
