package com.codewithharry.shape;

class Square {
    int Length;

    public void SetLength(int Length) {
        this.Length = Length;
        System.out.println("Length Is - " + Length);
    }

    public int GetLength() {
        return this.Length;
    }

    public void SquareArea() {
        System.out.println("Area of Square is: " + this.Length * this.Length);
    }

    public void SquarePerimeter() {
        System.out.println("Area of Square is: " + 4 * this.Length);
    }
}

class Rectangle extends Square {
    int Breadth;

    public void SetBreadth(int Breadth) {
        this.Breadth = Breadth;
        System.out.println("Length Is - " + Length);
        System.out.println("Breadth Is - " + Breadth);

    }

    public int GetBreadth() {
        return this.Breadth;
    }

    public void RectangleArea() {
        System.out.println("Area of Rectangle is: " + this.Length * this.Breadth);
    }

    public void RectanglePerimeter() {
        System.out.println("Perimeter of Rectangle is: " + 2 * (this.Length + this.Breadth));
    }
}

class Circle {
    double Radius;

    public void SetRadius(double Radius) {

        this.Radius = Radius;
        System.out.println("Radius is: " + this.Radius);
    }

    public double GetRadius() {
        return this.Radius;
    }

    public void CircleArea() {
        System.out.println("Area of Circle is: " + 3.14 * this.Radius * this.Radius);
    }

    public void CircleCircumference() {
        System.out.println("Circumference of Circle is: " + 2.0 * Math.PI * this.Radius);
    }

}

class Cylinder extends Circle {
    double Height;

    public void SetHeight(double Height) {
        System.out.println("Radius is: " + this.Radius);

        this.Height = Height;
    }

    public double GetHeight() {
        return this.Height;
    }

    public void CylinderVolume() {
        System.out.println("Volume of Cylinder is: " + Math.PI * this.Radius * this.Radius * this.Height);
    }

    public void CylinderSurfaceArea() {
        System.out.println("Surface Area of Cylinder is: " + (2 * Math.PI * this.Radius * this.Height)
                + (2 * Math.PI * this.Radius * this.Radius));
    }

}

class Sphere extends Circle {

    public void SphereVolume() {
        System.out.println("Volume of Sphere is: " + (4.0 / 3.0) * Math.PI * this.Radius * this.Radius * this.Radius);
    }

    public void SphereSurfaceArea() {
        System.out.println("Surface Area of Sphere is: " + 4 * Math.PI * this.Radius * this.Radius);
    }

}

public class Exercise_5 {
    public static void main(String[] args) {

        Rectangle MyRectangle = new Rectangle();
        MyRectangle.SetLength(20);
        MyRectangle.SetBreadth(5);
        MyRectangle.RectangleArea();
        MyRectangle.RectanglePerimeter();
        MyRectangle.SquareArea();
        MyRectangle.SquarePerimeter();

        Cylinder MyCylinder = new Cylinder();
        MyCylinder.SetRadius(5);
        MyCylinder.SetHeight(5);
        MyCylinder.CylinderVolume();
        MyCylinder.CylinderSurfaceArea();

        Sphere MySphere = new Sphere();
        MySphere.SetRadius(5);
        MySphere.SphereVolume();
        MySphere.SphereSurfaceArea();
        MySphere.CircleArea();
        MySphere.CircleCircumference();

    }
}