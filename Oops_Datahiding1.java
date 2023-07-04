
//WAP class and in the class create a method to find the sum of two numbers(data member) and hide the data member. create use get and set method assign the value to the numbers to find their sum.

import java.util.Scanner;
public class Oops_Datahiding1
 {
    public static void main(String[] args)
    {
        sum s1 = new sum();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the frist number : ");
        s1.setNum1(sc.nextInt());
        System.out.println("Enter the second element : ");
        s1.setNum2(sc.nextInt());

        int adds = s1.add();
        System.out.println("Sum is equal to : " + adds);
    }

}

class sum 
{
    private int x;
    private int y;

    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public void setNum1(int n1)
    {
        if(n1>0)
        {
            x=n1;
        } else 
        {
            x=0;
        }
    }

    public void setNum2(int n2)
    {
        if(n2>0)
        {
            y=n2;
        }
        else {
            y=0;
        }
    }

    
    public int add()
    {
        return x+y;
    }
}