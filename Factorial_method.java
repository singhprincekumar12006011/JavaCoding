//WAP  to find the factorial of a number using method. Take the number as input from user. 
/* Example:- 

Enter the number:
5

Output:
120


*/

import java.util.Scanner;

public class Factorial_Method {
    public static void main(String[] args)
    {
        int p;
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        p=sc.nextInt();
        Logic(p);
        //System.out.println(Logic(p));
    }
    public static int Logic(int x)
    {
        int result = 1;
        for(int i = 1; i <= x; i++)
        {

            result = result * i;
        }
        System.out.println(result);
        //return result;
        return 0;
    }
}


