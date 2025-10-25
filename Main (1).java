/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
// Base class
abstract class Shape {
    abstract void area(); // abstract method to be implemented in child classes
}

// 2D Shapes
abstract class TwoD extends Shape {
    // You can add common properties for 2D shapes if needed
}

// 3D Shapes
abstract class ThreeD extends Shape {
    // You can add common properties for 3D shapes if needed
}

// Circle class
class Circle extends TwoD {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void area() {
        double a = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + a);
    }
}

// Rectangle class
class Rectangle extends TwoD {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    void area() {
        double a = length * width;
        System.out.println("Area of Rectangle: " + a);
    }
}

// Sphere class
class Sphere extends ThreeD {
    double radius;

    Sphere(double r) {
        radius = r;
    }

    void area() {
        double a = 4 * Math.PI * radius * radius;
        System.out.println("Surface Area of Sphere: " + a);
    }
}

// Cylinder class
class Cylinder extends ThreeD {
    double radius, height;

    Cylinder(double r, double h) {
        radius = r;
        height = h;
    }

    void area() {
        double a = 2 * Math.PI * radius * (radius + height);
        System.out.println("Surface Area of Cylinder: " + a);
    }
}

// Main class to test
public class ShapeHierarchy {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4, 6);
        Sphere s = new Sphere(3);
        Cylinder cy = new Cylinder(2, 5);

        c.area();
        r.area();
        s.area();
        cy.area();
    }
}
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}