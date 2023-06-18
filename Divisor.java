// wap program to find the divisors of the number. take the input from user.


import java.util.Scanner;

public class Divisor {
    public static void main(String[] args)
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        num = sc.nextInt();
        Logic(num);

    }

    public static int Logic(int n)
    {
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                System.out.println(i);
            }
        }
        return n;
    }

}
