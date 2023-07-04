

import java.util.Scanner;

public class Oops_DataHiding_Rectangle {
    public static void main(String[] args)
    {
        rec r1=new rec();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of rectangle :");
        int len=sc.nextInt();
        r1.setLength(len);

        System.out.println("Enter the breadth of rectangle : ");
        r1.setBreadth(sc.nextInt());

        System.out.println("The area of rectangle is : " + r1.area()+"\n \n");
        System.out.println("The perimeter of rectangle is : " + r1.perimeter()+"\n \n");
        System.out.println("The diagonal of rectangle is : " + r1.diagonal());
    }
    
}


class rec
{
    private int length;
    private int breadth;

    //getmethod to access the length data member.
    public int getLength()
    {
        return length;
    }
    public int getBreadth()
    {
        return breadth;
    }

    //setMethod to assign the value to the length and breadth data member.
    public void setLength(int l)
    {
        if(l>0)
        {
            length=l;
        }
        else{
            length=0;
        }
    }
    public void setBreadth(int b)
    {
        if(b>0)
        {
            breadth=b;
        }else{
            breadth=0;
        }
    }

    //creating a method to calculate the area.
    public int area()
    {
        return length*breadth;
    }
    //creating a method to calculate the perimeter of rectangle.
    public int perimeter()
    {
        return 2*(length+breadth);
    }

    //creating method to find the diagonal of rectangle 
    public double diagonal()
    {
        return Math.sqrt(Math.pow(length,2) + Math.pow(breadth, 2));
    }
}
