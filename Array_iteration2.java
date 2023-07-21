/* 
//using while loop
public class Array_iteration2 {
    public static void main(String[] args)
    {

        int[] arr = {1,2,3,4,5};
        int i =0;
        int element;
        while (i < arr.length)
        {
           element = arr[i];
           System.out.print(element + " ");
           i++;
        }
       
    }
}

*/

import java.util.Scanner;
class Array_iteration2 {
    public static void main(String[] args)
    {
        int arr[] = new int[5];
        int i=0;
        Scanner sc = new Scanner(System.in);

        // the for loop to assing the value to an array.
        for(int j = 0; j<arr.length; j++)
        {
            System.out.println("enter the element of " + j + " index :");
            arr[j]=sc.nextInt();
        }

        // to printing the value of an array using while loop 

        while(i<arr.length)
        {
            int element = arr[i];
            System.out.print(element + " ");
            i++;
        }
    }
}


