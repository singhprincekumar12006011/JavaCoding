

import java.util.Scanner;
public class Oops_Circle {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  radius of circle : ");
        circle s1 = new circle();
        s1.radius = sc.nextInt();
        System.out.println("the area of cirlce is " + s1.area());
        System.out.println("The perimeter of circle is " + s1.perimeter());
    }
}


class circle 
{
    public double radius ;

    public double  area()
    {

        return Math.PI * radius *radius;
    }

    public double perimeter()
    {
        return Math.PI *2*radius;
    }




}
