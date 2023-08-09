import java.util.*;

interface Calculation {
    public double cal (double x, double y);
}
public class Lambda_division {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        double a = sc.nextInt();
        System.out.println("Enter the second number :");
        double b = sc.nextInt();

        Calculation d1 = (double x, double y) -> {
            return ( x / y );
        };

        Calculation d2 = (double x , double y) -> {
            return (x - y);
        };

        double sub = d2.cal(a, b);


        double result = d1.cal(a, b);
        System.out.println("Division of  : " + a + " and " + b + " is " +  result);
        System.out.println("Subtraction of  : " + a + " and " + b + " is " + sub);
        System.out.println(" \n              Thank you           \n \n");
    }
}
