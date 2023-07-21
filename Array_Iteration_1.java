//In java, there are defferent way of iterating the array 
//using for loop 
//enhance for loop
//while loop



/* 
//Using for loop

public class Array_Iteration_1{
    public static void main(String[] args)
    {
        int arr[]={20,3,4,56,76};

        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }



    }
}

*/

// Using enhanced for loop

public class Array_Iteration_1{
    public static void main(String[] args)
    {
        int[] array = new int[5];
        int p=10;

        // to asing the value elements in an array we will use enhances for loop
        int i = 0;
        for (int element : array) {
            array[i] = p;
            p += 10;
            i++;
        }
        // to print the elements 

        for(int element: array)
        {
            System.out.println(element);
        }

    }
}