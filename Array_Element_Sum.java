//WAP to find the sum of element of an array. Take the array as input from the user. 

import java.util.Scanner;
public class Array_Element_Sum {
    public static void main(String[] agrs)
    {
        int[] a;
        int sum=0;
        a=new int[10];
        Scanner sc = new Scanner(System.in);
        //Assing the elements to the array.
        for(int i=0; i<a.length; i++)
        {
            System.out.println("Enter the element of [" + i + "] :");
            a[i]=sc.nextInt();
        }

        // to find the sum of an element.
        for(int i=0; i<a.length; i++)
        {
            sum=sum + a[i];
        }
        System.out.println("The usm of an element of an array is :" + sum);
    }
    
}
