import java.util.*;

//creating an abstract class
abstract class Shape {
    abstract double area(); //abstract method
    abstract double perimeter(); //abstract method

    //concrete method
    public void Dis() {
        System.out.println("This is a demo of an abstract class :");
    }
}

//inheriting from Shape class
class Rectangle extends Shape {
    int length; //data member
    int breadth; // data member of Rectangle class

    //Assing the value to the data member.
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // overriding the abstract method of Shape class.
    // to be a concrete class, we must override all the abstract method of parent class.
    @Override
    public double area() {
        return length * breadth;
    }

    //overriding the method of parent class.
    @Override
    public double perimeter() {
        return 2 * (length + breadth);
    }
}

public class AbstractShapeRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        int len = sc.nextInt();
        System.out.println("Enter the breadth of the rectangle:");
        int bred = sc.nextInt();

        //creating the object of Rectangle class.
        Rectangle rec = new Rectangle(len, bred);
        rec.Dis();
        System.out.println("The area of the rectangle is " + rec.area());
        System.out.println("The perimeter of the rectangle is: " + rec.perimeter());
    }
}
