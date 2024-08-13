import java.util.Scanner;

class MyCircle {
    protected double Radius;

    MyCircle() {
        System.out.println("This Is A MyCircle Constructor");
    }

    MyCircle(double Radius) {
        this.Radius = Radius;
    }

    public double CircleArea() {
        return Math.PI * Radius * Radius;
    }
}

class MyCylinder extends MyCircle {
    private double Height;

    MyCylinder() {
        System.out.println("This Is A MyCylinder Constructor");
    }

    MyCylinder(double Radius, double Height) {
        super(Radius);
        this.Height = Height;
    }

    public double Volume() {
        return Math.PI * Radius * Radius * Height;
    }

    public double SurfaceArea() {
        return (2 * Math.PI * Radius * Height) + (2 * Math.PI * Radius * Radius);
    }
}

public class Practice_Problem_3 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        MyCylinder MyCylinder_1 = new MyCylinder();
        System.out.println("Please Enter The Radius Of The Circle And Cylinder Also The Height Of The Cylinder As Well");
        MyCylinder MyCylinder_2 = new MyCylinder(Input.nextInt(), Input.nextInt());
        System.out.println("The Surface Area Of Cylinder Is - " + MyCylinder_2.SurfaceArea());
        System.out.println("The Volume Of The Cylinder Is - " + MyCylinder_2.Volume());
        System.out.println("The Area Of The Circle Is - " + MyCylinder_2.CircleArea());

    }
}
