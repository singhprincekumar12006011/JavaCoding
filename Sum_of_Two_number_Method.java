//Write the program to find the sum of two number using method. 
//Take the input from user.

import java.util.Scanner;

public class Method1 {
    public static void main(String[] args){
        int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number ");
        x = sc.nextInt();

        System.out.println("Enter the second number");
        y = sc.nextInt();
        //calling getTotal and dtoring the value in sum:
         int sum =getTotal(x,y);
         System.out.println("The sum first" + x +" and " + "second" + " number is " + sum );
    }
    
    // creating a method 
    public static int getTotal(int num1, int num2)
    {
        return num1 + num2;
    }
}
