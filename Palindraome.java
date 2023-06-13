//WAP to check the nnumber is palindrome or not. take the input from user.




import java.util.Scanner;

class Palidrome {
    static boolean Check_Palindrome(int num1)
    {
        int reverse=0;
        int x=num1;
        while(x != 0)
        {
            reverse = (reverse * 10) + (x%10);
            x=x/10;
        }
        return(reverse == num1);
    }
    public static void main(String[] args)
    {
        int num1;
        System.out.println("Enter the number : ");

        Scanner sc = new Scanner(System.in);
        num1=sc.nextInt();

        if(Check_Palindrome(num1) == true)
        {
            System.out.println("yes");

        } else {
            System.out.println("No");
        }
    }
}
