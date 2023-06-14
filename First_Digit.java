// WAP to print the first digit of the number. TAke the input from the user.


import java.util.Scanner;
public class First_Digit {
    public static void main(String[] args)
     {
        int x = 0;
        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        System.out.println(First(x));

    }

    public static int First(int num)
    {
        while(num>10){
            num=num/10;
        }
        return num;
    }
}




