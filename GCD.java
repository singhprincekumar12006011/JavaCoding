// Wap to find the GCD of two number. Take the numbers input from the user.



import java.util.Scanner;



public class GCD {
    public static void main(String[] args) {
        int num1, num2, result=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        num1 = sc.nextInt();
        System.out.println();
        num2 = sc.nextInt();

        int x = Math.min(num1, num2);

        for (int i = 1; i <=x; i++)
        {
            if (num1 % i == 0 && num2 % i == 0)
            {
                result = i;

            }
        }
        System.out.println(result);

    }

}
