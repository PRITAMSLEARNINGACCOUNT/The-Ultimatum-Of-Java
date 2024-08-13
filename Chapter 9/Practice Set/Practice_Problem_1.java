class Cylinder_Practice_Problem_1 {
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
}

public class Practice_Problem_1 {
    public static void main(String[] args) {
        Cylinder_Practice_Problem_1 myCylinderPracticeProblem1 = new Cylinder_Practice_Problem_1();
        myCylinderPracticeProblem1.setRadius(5.0);
        myCylinderPracticeProblem1.setHeight(10.0);
        System.out.println("Radius Of The Cylinder_Practice_Problem_1 Is :- " + myCylinderPracticeProblem1.getRadius());
        System.out.println("Height Of The Cylinder_Practice_Problem_1 Is :- " + myCylinderPracticeProblem1.getHeight());
    }
}
