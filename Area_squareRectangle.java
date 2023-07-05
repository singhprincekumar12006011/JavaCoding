// Parent class: Shape
class Shape {
    // Common methods and fields
    public void displayArea() {
        System.out.println("Calculating area...");
    }
}

// Child class: Square
class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void displayArea() {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }
}

// Child class: Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void displayArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5.0);
        square.displayArea();

        Rectangle rectangle = new Rectangle(4.0, 6.0);
        rectangle.displayArea();
    }
}
