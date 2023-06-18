// WAP to find the multiplication of two number using method. Take the input from user.


import java.util.Scanner;

public class Method_Multiplication {
    public static void main(String[] args)
    {
     int p,t;
     System.out.println("Enter the first number");
     Scanner sc = new Scanner(System.in);
     p=sc.nextInt();
     System.out.println("Enter the second number: ");
     t= sc.nextInt();
     System.out.println(mult(p,t));
    }
    public static int mult(int x, int y)
    {
        int result = x * y;
        return result;
    }
}
