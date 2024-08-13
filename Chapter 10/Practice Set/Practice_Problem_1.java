class Circle {
    Circle() {
        System.out.println("This Is A Circle Constructor");
    }
}

class Cylinder extends Circle {
    Cylinder() {
        System.out.println("This Is A Cylinder Constructor");
    }
}

public class Practice_Problem_1 {
    public static void main(String[] args) {
        Cylinder MyCylinder = new Cylinder();

    }
}
