//WAP to find the average of an element of array. Take element as the input from user. 

import java.util.Scanner;

public class array_average {
    public static void main(String[] args)
    {
        int arr[] = new int[10];
        int sum=0;
        int aver=0;
        System.out.println("Enter the element is an array:");
        Scanner p = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++)
        {
            arr[i]=p.nextInt();
        }
        for(int i =0; i<arr.length; i++)
        {
            sum += arr[i];
        }
        aver=sum/arr.length;
        System.out.println(aver);

    }
}
