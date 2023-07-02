
import java.math.BigInteger;
import java.util.Scanner;
public class BigInteger_FibonacciNo {

    public static void main(String[] args)
    {
        BigInteger first = new BigInteger("0");
        BigInteger second = new BigInteger("1");
        System.out.println("Enter the number :");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The fibonacci numbers are : ");
        System.out.print(first + " " + second);


        BigInteger result = null;
        for(int i=2; i <= n; i++)
        {
            result = first.add(second);

            first = second;
            second = result;
            System.out.print( " " + result);
        }
        
    }
    
}
