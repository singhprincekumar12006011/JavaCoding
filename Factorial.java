//WAP to find the factorial of the number.
// Take number as input from the user.


import java.util.Scanner;

public class Factorial {
    public static void main(String[] args)
    {
        int num1;
        int result = 1 ;
        System.out.println("Enter the number to find factorial");

        Scanner sc = new Scanner(System.in);
        num1 =  sc.nextInt();
        while (num1>0)
        {
            result = result * num1;
            num1--;
        }
        System.out.println(result);
    }
}
