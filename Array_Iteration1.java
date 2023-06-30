//WAP to demonstrate the the iteration of an array usind for loop.

import java.util.Scanner;
public class Array_Iteration1 { 
    public static void main(String[] args)
    {
        
        int size;
        
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        size =sc.nextInt();
        int[] arr = new int[size];
        // Assing the value of an array 
        
        for (int i=0; i < size; i++)
        {
            System.out.println("Enter the element of ["+i+"] index :");
            arr[i]=sc.nextInt();
        }

        //print the element of an array using ffor loop.

        for (int i=0; i<size; i++)
        {
            System.out.print(arr[i]);
        }
    }
}


