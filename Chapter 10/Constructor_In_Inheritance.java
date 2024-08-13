class Base {
    int Varriable_1;

    Base() {
        System.out.println("Base Class Constructor Called & The Value Of The Varriable In Base Class Has Not Been Set");
    }

    Base(int Value) {
        Varriable_1 = Value;
    }
}

class Derived extends Base {
    int Varriable_2;

    Derived(int Value) {
        System.out.println("Derived Class Constructor Called");
        Varriable_2 = Value;
        System.out.println("The Value Of The Varriable In Derived Class Has Been Set Using This Constructor");
    }

    Derived(int Value_1, int Value_2) {
        super(Value_1);
        Varriable_2 = Value_2;
        System.out.println(
                "The Value Of The Varriable In Derived Class & Base Class Has Been Set Using This Constructor");
    }
}

public class Constructor_In_Inheritance {
    public static void main(String[] args) {
        Derived Object_1 = new Derived(10);
        System.out.println("The Value Of The Varriable In Base Class Is: " + Object_1.Varriable_1);
        System.out.println("The Value Of The Varriable In Derived Class Is: " + Object_1.Varriable_2);
        Derived Object_2 = new Derived(20, 30);
        System.out.println("The Value Of The Varriable In Base Class Is: " + Object_2.Varriable_1);
        System.out.println("The Value Of The Varriable In Derived Class Is: " + Object_2.Varriable_2);
    }
}