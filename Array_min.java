//WAP to find the min or smallest element of an array. Take the element from user.




import java.util.Scanner;

public class Array_input {
    public static void main(String[] args)
    {
        int array[] = new int[5], min;
        System.out.println("Enter the element of an array: ");
        Scanner p = new Scanner(System.in);
        for (int i=0; i <array.length; i++)
        {
            array[i]=p.nextInt();
        }
        min=array[0];
        for (int j=0; j < array.length; j++)
        {
            if (array[j]<min)
            {
                min=array[j];
            }
        }
        System.out.println(min);

    }
}
