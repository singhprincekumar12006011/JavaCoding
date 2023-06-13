// WAP to find the trailing zero in Factorial. take the input from user to find the factorial. 




import java.util.Scanner;
public class trailing_Zero {
    public static void main(String[] args)
    {
        int num1;
        int fact=1;
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        num1= sc.nextInt();

        for(int i=1; i<=num1; i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);

        int result=0;
        while(fact % 10 == 0)
        {
            result++;
            fact=fact/10;
        }
        System.out.println(result);

    }
}
