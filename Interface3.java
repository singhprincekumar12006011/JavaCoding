

/*
 You are building a drawing application that allows users to draw various shapes, such as circles and rectangles, on a canvas. Implement an
interface Shape that defines common methods for all shapes, and then create classes for two types of shapes: Circle and Rectangle. Each class 
should implement the Shape interface and provide appropriate methods for calculating area and perimeter (circumference for the circle). Test your 
implementation by creating instances of Circle and Rectangle and displaying their area and perimeter.
 */


interface Shape {
    double getArea();
    double getPerimeter();
}

// Circle class implementing the Shape interface
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Rectangle class implementing the Shape interface
class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}

public class Interface3 {
    public static void main(String[] args) {
        // Create a Circle and a Rectangle
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        // Display the area and perimeter of the Circle
        System.out.println("Circle - Radius: 5");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println();

        // Display the area and perimeter of the Rectangle
        System.out.println("Rectangle - Length: 4, Width: 6");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
}