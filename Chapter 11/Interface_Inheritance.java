interface Interface1 {
    String InterfaceVariable = "Interface 1";

    void FirstMethod();
}

interface Interface2 extends Interface1 {
    String InterfaceVariable_2 = "Interface 2";

    void SecondMethod();
}

class InterfaceInheritance implements Interface2 {
    public void FirstMethod() {
        System.out.println("First Method In Interface 1 " + InterfaceVariable);
    }

    public void SecondMethod() {
        System.out.println("Second Method In Interface 2 " + InterfaceVariable_2);
    }
}

public class Interface_Inheritance {
    public static void main(String[] args) {
        InterfaceInheritance MyObject = new InterfaceInheritance();
        MyObject.FirstMethod();
        MyObject.SecondMethod();

    }
}