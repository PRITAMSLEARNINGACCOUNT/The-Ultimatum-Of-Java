class Square {
    int Side;

    public int CalculateArea() {
        return Side * Side;
    }

    public int CalculatePerimeter() {
        return 4 * Side;
    }
}

public class Practice_3 {
    public static void main(String[] args) {
        Square square = new Square();
        square.Side = 5;
        System.out.println("Area of square: " + square.CalculateArea());
        System.out.println("Perimeter of square: " + square.CalculatePerimeter());
    }
}
