import java.util.*;
class Shape 
{
    //data member
    int length;
    int breadth;
    double radius;
    double pi = 3.14;
    int side;

    //creating the constructor having two parameter
    //this will assing the value to the length and breadth.
    Shape(int i, int j)
    {
        length=i;
        breadth=j;
    }

    //creating the constructor with single parameter
    //this will assing the value to the radius.
    Shape(double k)
    {
        radius = k;
    }

    Shape(int sd)
    {
        sd=side;
    }
}

class measur extends Shape 
{
    int area;
    double circle_area;
    measur(int i , int j)
    {
        super(i , j);
        area=i*j;
        System.out.println("The of rectangle is :"  + area);
    }
    measur(double k)
    {
        super(k);
        circle_area = 3.14 * k * k;
        System.out.println("The area of circle  : " + circle_area);
    }
    measur(int sd)
    {
        super(sd);
        area=sd*sd;
        System.out.println("The area of Square : " + area);
    }
}

public class Inheritance_Shape {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int l, b, s;
        double p;
        System.out.println("Enter length of rectangle:");
        l=sc.nextInt();
        System.out.println("Enter the  breadth of rectangle:");
        b=sc.nextInt();
        System.out.println("Enter the side of Square:");
        s=sc.nextInt();
        System.out.println("Enter the radius of circle:");
        p=sc.nextDouble();

        //creating an object of the class subclass
        measur m = new measur(l,b);

        measur t = new measur(s);

        measur c = new measur(p);
    }
    
}
