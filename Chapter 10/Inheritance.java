class GrandParent {
    void ParentMethod() {
        System.out.println("Parent Method Of GrandParent Class Is Called");
    }
}

class GrandChild extends GrandParent {
    void ChildMethod() {
        System.out.println("Child Method Of GrandChild Class Is Called");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        GrandChild Child = new GrandChild();
        Child.ParentMethod();
        Child.ChildMethod();
    }

}
