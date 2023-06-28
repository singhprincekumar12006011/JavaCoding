
import java.util.Scanner;
public class Multi_Dimensional_element_multi {
    public static void main(String[] args)
    {
        int row;
        int col; 
        System.out.println("Enter the value of row");
        Scanner sc=new Scanner(System.in);
        row=sc.nextInt();
        System.out.println("Enter the element of column");
        col=sc.nextInt();
        int[][] arr=new int[row][col];

        //Assing the value to array 
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                System.out.println("Enter the element of row [" + i + "][" + j + "]");
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0; i<row; i++)
        {
            int mult=1;
            for(int j=0; j<col; j++)
            {
                System.out.print(arr[i][j]);
                mult *=arr[i][j];
            }
            System.out.println();
            System.out.println("The multiplication is :" + mult);
        }

    }
    
}
