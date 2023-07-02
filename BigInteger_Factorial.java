

import java.math.BigInteger;
import java.util.Scanner;
public class BigInteger_Factorial {
    public static void main(String[] args)
    {
        int x;
        System.out.println("enter the number to find the factorial :");
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        BigInteger y = new BigInteger(String.valueOf(x));
        BigInteger fact = BigInteger.ONE;

        //logic 
        for (int i=1; i<=x; i++)
        {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        
        System.out.println("Factorial of " + x + " " + fact);
    }
    
}
