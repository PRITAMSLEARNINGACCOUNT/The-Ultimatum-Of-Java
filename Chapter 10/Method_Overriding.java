class Parent {
    public void display() {
        System.out.println("Display Method Of Parent class Is Called");
    }
}

class Child extends Parent {
    @Override
    public void display() {
        System.out.println("Display Method Of Child class Is Called");
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        Parent Object_1 = new Parent();
        Object_1.display();
        Parent Object_2 = new Child();
        Object_2.display();
    }
}
