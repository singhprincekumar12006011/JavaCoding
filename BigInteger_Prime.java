

import java.math.BigInteger;
import java.util.Scanner;
public class BigInteger_Prime {
    public static void main(String[] args)
    {

        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to check for prime  :");
        number = sc.nextInt();
        
        BigInteger next = null;
        for(int i=2; i<number; i++)
        {
            if(number % i != 0);
        }
        System.out.println(number + " is a prime number :");
        BigInteger num = new BigInteger(String.valueOf(number));
        BigInteger nePrime = num.nextProbablePrime();
        System.out.println(nePrime);
    }
    
}
