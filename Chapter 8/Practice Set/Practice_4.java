class Rectangle {
    int Breadth, Length;

    public int CalculateArea() {
        return Breadth * Length;
    }

    public int CalculatePerimeter() {
        return 2 * (Breadth + Length);
    }

}

public class Practice_4 {
    public static void main(String[] args) {
        Rectangle MyRectangle = new Rectangle();
        MyRectangle.Breadth = 10;
        MyRectangle.Length = 20;
        System.out.println("Area of Rectangle is: " + MyRectangle.CalculateArea());
        System.out.println("Perimeter of Rectangle is: " + MyRectangle.CalculatePerimeter());
    }
}
