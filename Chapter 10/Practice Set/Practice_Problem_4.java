class MyRectangle {
    protected int Length;
    protected int Width;

    public MyRectangle() {
        System.out.println("This Is A MyRectangle Constructor");
    }

    public MyRectangle(int Length, int Width) {
        this.Length = Length;
        this.Width = Width;
    }

    public int RectangleArea() {
        return Length * Width;
    }

    public int RectanglePerimeter() {
        return 2 * (Length + Width);
    }

    public int getLength() {
        return Length;
    }

    public int getWidth() {
        return Width;
    }
}

class MyCuboid extends MyRectangle {
    private int Height;

    public MyCuboid() {
        System.out.println("This Is A MyCuboid Constructor");
    }

    public MyCuboid(int Length, int Width, int Height) {
        super(Length, Width);
        this.Height = Height;
    }

    public int CuboidPerimeter() {
        return 4 * (Length + Width + Height);
    }

    public int CuboidArea() {
        return 2 * ((Length * Width) + (Width * Height) + (Height * Length));
    }

    public int CuboidVolume() {
        return Length * Width * Height;
    }

    public int getHeight() {
        return Height;
    }
}

public class Practice_Problem_4 {
    public static void main(String[] args) {
        MyCuboid MyCuboid_1 = new MyCuboid();
        MyCuboid MyCuboid_2 = new MyCuboid(10, 20, 30);
        System.out.println("The Length Of The Rectangle Is - " + MyCuboid_2.getLength());
        System.out.println("The Width Of The Rectangle Is - " + MyCuboid_2.getWidth());
        System.out.println("The Height Of The Cuboid Is - " + MyCuboid_2.getHeight());
        System.out.println("The Area Of The Cuboid Is - " + MyCuboid_2.CuboidArea());
        System.out.println("The Perimeter Of The Cuboid Is - " + MyCuboid_2.CuboidPerimeter());
        System.out.println("The Volume Of The Cuboid Is - " + MyCuboid_2.CuboidVolume());
        System.out.println("The Area Of The Rectangle Is - " + MyCuboid_2.RectangleArea());
        System.out.println("The Perimeter Of The Rectangle Is - " + MyCuboid_2.RectanglePerimeter());
    }
}
