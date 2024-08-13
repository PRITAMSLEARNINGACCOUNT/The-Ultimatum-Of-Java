class Sphere {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

public class Practice_Problem_5 {
    public static void main(String[] args) {
        Sphere MySphere = new Sphere();
        MySphere.setRadius(5.0);
        if (MySphere.getRadius() == 0.0) {
            System.out.println("Please Set The Radius Of The Sphere Using The Setter");
        } else {
            System.out.println("The Radius Of The Sphere Is :- " + MySphere.getRadius());
        }

    }
}
