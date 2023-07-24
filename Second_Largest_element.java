
import java.util.*;
public class Second_Largest_element {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array :");
        int x=sc.nextInt();
        int[] arr = new int[x];
        //assing the element to the array :

        for(int i=0; i<x; i++)
        {
            System.out.println("Enter the element of " + i + " index :");
            arr[i]=sc.nextInt();
        }

        // printing an array.
        System.out.println("The element before sorting :");
        for(int p:arr)
        {
            System.out.print(p + " ");
        }

        //sorting an array 
        for (int i=0; i<arr.length-1; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] > arr[j]) 
                {
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        //Printing an array after sorting
        System.out.println("Array after sorting  :");
        for(int t:arr)
        {
            System.out.print(t+ " ");
        }

        System.out.println();

        System.out.println("The second largest element of the array is : " + arr[arr.length-2]);
    }
    
}
