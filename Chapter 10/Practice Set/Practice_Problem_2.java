class Rectangle {
    public Rectangle() {
        System.out.println("This Is A Rectangle Constructor");
    }
}

class Cuboid extends Rectangle {
    public Cuboid() {
        System.out.println("This Is A Cuboid Constructor");
    }
}

public class Practice_Problem_2 {
    public static void main(String[] args) {
        Cuboid MyCuboid = new Cuboid();
    }
}
