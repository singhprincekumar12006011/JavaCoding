//WAP to print the greater number among three number.
// Take these umber input from the user.

import java.util.Scanner;

public class Greater_number {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        num1 = sc.nextInt();
        System.out.println("Enter the 2nd number:");
        num2 = sc.nextInt();
        System.out.println("Enter the 1st number:");
        num3 = sc.nextInt();

        if(num1>num2 || num1>num2)
        {
            System.out.println(num1 + " is the greatest number:");
        } else if (num2>num1 || num2>num3)
        {
            System.out.println(num2 + " is the greatest number:");
        } else if (num3>num1 || num3>num2)
        {
            System.out.println(num3 + " is the greatest number:");
        }

    }
}
