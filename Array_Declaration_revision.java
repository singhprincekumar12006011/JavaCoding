//WAP to declare an array and assing the value by user.

import java.util.Scanner;

public class Array_Declaration_revision {
    public static void main(String[] args)
     {
        int[] a = new int[5];
        Scanner sc =new Scanner(System.in);

        //This will assing the value entered by the user. 
        for(int i=0; i<a.length; i++)
        {
            System.out.println("Enter the value of [" + i + "] :");
            a[i]=sc.nextInt();
        }

        //To print the element of an array.
        System.out.println("The array that you have entered is :");
        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i] + " ");
        }


    }
    
}
