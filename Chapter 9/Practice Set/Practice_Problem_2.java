class Cylinder_Practice_Problem_2 {
    private double radius;
    private double height;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double Calculate_Surface_Area() {
        double Surface_Area = 2 * Math.PI * radius * (radius + height);
        return Surface_Area;
    }

    public double Calculate_Volume() {
        double Volume = Math.PI * radius * radius * height;
        return Volume;
    }
}

public class Practice_Problem_2 {
    public static void main(String[] args) {
        Cylinder_Practice_Problem_2 MyCylinder = new Cylinder_Practice_Problem_2();
        MyCylinder.setRadius(5.0);
        MyCylinder.setHeight(10.0);

        System.out.println("Radius Of The Cylinder_Practice_Problem_1 Is :- " + MyCylinder.getRadius());
        System.out.println("Height Of The Cylinder_Practice_Problem_1 Is :- " + MyCylinder.getHeight());
        System.out.println("Surface Area Of The Cylinder_Practice_Problem_1 Is :- " + MyCylinder.Calculate_Surface_Area());
        System.out.println("Volume Of The Cylinder_Practice_Problem_1 Is :- " + MyCylinder.Calculate_Volume());
    }
}
