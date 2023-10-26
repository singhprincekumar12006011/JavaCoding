//creating an abstract class

import java.util.*;
abstract class Shape {
    abstract  double area(); // abstract method

    public void display()
    {
        System.out.println("This is shape class");
    }
}

// concrete class which inherite the property from shape class
class Square extends Shape { 
    double side;
    public Square(double side){
        this.side=side;
    }

    @Override
    public double area(){
        return side*side;
    }

}

class Abstract_shape{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side of square :");
        double s = sc.nextDouble();

        Square sq = new Square(s);
        sq.display();
        System.out.println("Area  of square is " + sq.area());
    }
}