


import java.math.BigInteger;
import java.util.Scanner;

public class BigInteger_Sum {
    public static void main(String[] args) 
    {
        int n;
        System.out.println("Enter the number :");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        BigInteger bt = new BigInteger(String.valueOf(n));
        BigInteger sum = BigInteger.ZERO;

        for(int i=0; i<=n; i++)
        {
            sum = sum.add(BigInteger.valueOf(i));
        }
        System.out.println("The sum of " + n + "th number is " + sum);

    }
    
}
