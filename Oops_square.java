
import java.util.Scanner;
public class Oops_square {

    public static void main(String[] args)
    {
        System.out.println("Enter the side of square :");
        Scanner sc = new Scanner(System.in);

        square s1 = new square();

        s1.side=sc.nextInt();

        int area = s1.area();
        System.out.println("The Area of Square is : " + area );

        System.out.println("The perimeter of the square is : " + s1.perimeter() );

        System.out.println("The diagonal of the square is : " + s1.diagonal());
    }
    
}

class square 
{
     public int side ;

     public int area()
     {
        return side*side;
     }

     public int perimeter()
     {
        return 4*side;
     }

     public double diagonal()
     {
        return Math.sqrt(Math.pow(side,2) + Math.pow(side, 2));
     }
}
