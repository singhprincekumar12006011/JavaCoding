
import java.util.Scanner;
public class Oops_Rectangle {
    public static void main(String[] args )
    {
        System.out.println("enter the length of rectangle :");
        Scanner sc = new Scanner(System.in);

        //Creating an object of class rectangle 
        rectangle r1 = new rectangle();
        r1.length = sc.nextInt();
        System.out.println("Enter the breadth of rectangle :");
        r1.breadth = sc.nextInt();
        
        System.out.println("Area of rectangle is :" + r1.area());

        System.out.println("Perimeter of rectangle is : " + r1.perimeter());

        System.out.println("Diagonal of rectangle is : " + r1.diagonal());
    }
    
}

class rectangle
{
    int length;
    int breadth;

    public  int area()
    {
        return length*breadth;
    }


    public int perimeter()
    {
        return 2*(length + breadth);
    }

    public double diagonal()
    {
        return Math.sqrt(Math.pow(length, 2) + Math.pow(breadth, 2));
    }


}
