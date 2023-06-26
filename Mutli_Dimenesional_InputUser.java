

import java.util.Scanner;
public class Mutli_Dimenesional_InputUser {
    public static void main(String[] args)
    {
        //declaration of a multi-dimensional array 
        int[][] arr= new int[3][4];

        Scanner sc=new Scanner(System.in);

        for(int i=0; i<3; i++)
        {
            for(int j=0; j<4; j++)
            {
                System.out.println("Enter the value for [" + i + "][" + j + "]");
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("The 2D array is :");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<4; j++)
            {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
    
}
