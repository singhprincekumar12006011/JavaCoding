
/*
 

Right Triangle Star Pattern
*
* *
* * *
* * * *
* * * * *


 */
import java.util.Scanner;
public class Loop_Star_Pattern3 {
    public static void main(String[] args) 
    {
        int num;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of row :");
        num=sc.nextInt();

        for(int i=0; i<num; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }   
}
