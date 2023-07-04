
import java.util.Scanner;
public class Loop_Star_Pattern
{
    public static void main(String[] args) {
        int num;
        System.out.println("Enter the number of row :");
        Scanner sc = new Scanner(System.in);
        num=sc.nextInt();

        for(int i=0; i<num; i++)
        {
            for(int j = num; j>i; j--)
            {
                System.out.print("  ");
            }

            for(int k=1; k<=i; k++)
            {
                System.out.print("* ");
            }
            for(int l =2; l<=i; l++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }

}