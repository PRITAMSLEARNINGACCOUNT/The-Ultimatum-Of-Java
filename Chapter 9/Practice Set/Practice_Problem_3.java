class Cylinder_Practice_Problem_3 {
    private double radius;
    private double height;

    public Cylinder_Practice_Problem_3() {
        System.out.println("Please Set The Radius And Height Of The Cylinder By Using The Overloaded Constructor Before Proceeding Further");
    }

    public Cylinder_Practice_Problem_3(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public String getRadius() {
        if (radius == 0.0 && height == 0.0) {
            return "Please Set The Radius And Height Of The Cylinder Before Proceeding By Using The Overloaded Constructor";
        } else {
            return "Radius Of The Cylinder Is :- " + radius;
        }
    }

    public String getHeight() {
        if (radius == 0.0 && height == 0.0) {
            return "Please Set The Radius And Height Of The Cylinder Before Proceeding By Using The Overloaded Constructor";
        } else {
            return "Height Of The Cylinder Is :- " + height;
        }
    }


}


public class Practice_Problem_3 {
    public static void main(String[] args) {
        Cylinder_Practice_Problem_3 MyCylinder = new Cylinder_Practice_Problem_3();
        MyCylinder.getHeight();
        MyCylinder.getRadius();
        Cylinder_Practice_Problem_3 MyCylinder_2 = new Cylinder_Practice_Problem_3(5.0, 10.0);
        System.out.println(MyCylinder_2.getHeight());
        System.out.println(MyCylinder_2.getRadius());

    }
}
