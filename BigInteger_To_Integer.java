// WAP  to passing the value and store in BigInteger and convert the biginteger to integer.


import java.math.BigInteger;
import java.util.Scanner;
public class BigInteger_To_Integer {
    public static void main(String[] args)
    {
        System.out.println("Enter the value to store in biginteger :");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        //to store the value intered by an user.
        BigInteger a = new BigInteger(String.valueOf(x));
        System.out.println(a);

        //to convert the biginteger to integer.
        int A = a.intValue();
        System.out.println("Integer =" + A);

        //to convert the biginteger to string
        String S = a.toString();
        System.out.println("String = "+ S);




    }
    
}
