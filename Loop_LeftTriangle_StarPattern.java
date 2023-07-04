/*

Left Triangle Star Pattern

           * 
         * * 
       * * * 
     * * * * 
   * * * * *

 */



import java.util.Scanner;
public class Loop_LeftTriangle_StarPattern {
    public static void main(String[] args)
    {
        int num;
        System.out.println("Enter the number row:");
        Scanner sc = new Scanner(System.in);
        num=sc.nextInt();

        for(int i=0; i<num; i++)
        {
            for(int j=num; j>i; j--)
            {
                System.out.print("  ");
            }
            for(int k=0; k<=i; k++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    
}
