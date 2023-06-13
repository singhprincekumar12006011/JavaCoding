//WAP to find the multiplication of two number.
// Take the number as input from user.

import java.util.Scanner;

public class Multiplication_Method
{
    public static void main(String[] args)
    {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        a = sc.nextInt();
        System.out.println("Enter the value of b : ");
        b = sc.nextInt();

        int result = mult(a,b);
        System.out.println(result);
    }
    public static int mult(int x, int y)
    {
        int p=0;
        p=x*y;
        return p;

    }
}
