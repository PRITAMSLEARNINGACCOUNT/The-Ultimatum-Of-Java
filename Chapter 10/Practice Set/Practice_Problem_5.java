class Base {
    public Base() {
        System.out.println("Base Constructor Called");
    }
}

class Derived_1 extends Base {
    public Derived_1() {
        System.out.println("Derived_1 Constructor Called");
    }
}

class Derived_2 extends Derived_1 {
    public Derived_2() {
        System.out.println("Derived_2 Constructor Called");
    }
}

public class Practice_Problem_5 {
    public static void main(String[] args) {
        Derived_2 Object = new Derived_2();
    }
}
