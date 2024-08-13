class Circle {
    double Radius;

    public double CalculateArea() {
        return 3.14 * Radius * Radius;
    }

    public double CalculatePerimeter() {
        return 2 * 3.14 * Radius;
    }
}

public class Practice_6 {
    public static void main(String[] args) {
        Circle MyCircle = new Circle();
        MyCircle.Radius = 5;
        System.out.println("Area of Circle: " + MyCircle.CalculateArea());
        System.out.println("Perimeter of Circle: " + MyCircle.CalculatePerimeter());
    }
}
