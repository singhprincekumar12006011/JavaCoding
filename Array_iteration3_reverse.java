
//WAP to print the reverse of an array 

import java.util.Scanner;
public class Array_iteration3_reverse {
    public static void main(String[] args)
    {
        int arr[] = new int[6];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i < arr.length; i++)
        {
            System.out.println("Enter the element of " + i + " element :");
            arr[i]=sc.nextInt(); 
        }

        //To print the element of an array.
        System.out.println("The array that we have enter is :");

        for(int m: arr)
        {
            System.out.print(m + " ");
        }

        System.out.println();
        // for reversing the element of an array
        int temp=0;
        int j = arr.length-1;
        for(int p=0; p<arr.length/2; p++)
        {
            temp=arr[p];
            arr[p]=arr[j];
            arr[j]=temp;
            j--;
        }

        //printing the element of an array using enhanced for loop.

        for(int t: arr)
        {
            System.out.print(t + " ");
        }
    }
    
}
