

import java.util.Scanner;
public class Multi_Dimension_element_Sum {
    public static void main(String[] args)
    {
        int row;
        int col;
        System.out.println("Enter the value of row");
        Scanner sc = new Scanner(System.in);
        row=sc.nextInt();
        System.out.println("Enter the value of coloum");
        col=sc.nextInt();

        //declaaration of an array.
        int[][] arr = new int[row][col];

        //assing the value to the array:
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                System.out.println("Enter the value of [" + i + "][" + j + "]");
                arr[i][j]=sc.nextInt();
            }
        }

        //for printing the array
        for(int i=0; i<row; i++)
        {
            int sum=0;
            for(int j=0; j<col; j++)
            {
                System.out.print(arr[i][j]);
                sum += arr[i][j];
                
            }
            System.out.println();
            System.out.println("the sum of row " + i + " is " + sum);
        }

    }
    
}
