// WAP to print the pattern:

 *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  * 
 *  *  *  *  *  *  *  *  *        *  *  *  *  *  *  *  *  * 
 *  *  *  *  *  *  *  *              *  *  *  *  *  *  *  * 
 *  *  *  *  *  *  *                    *  *  *  *  *  *  * 
 *  *  *  *  *  *                          *  *  *  *  *  * 
 *  *  *  *  *                                *  *  *  *  * 
 *  *  *  *                                      *  *  *  * 
 *  *  *                                            *  *  * 
 *  *                                                  *  * 
 *                                                        * 
 *  *                                                  *  * 
 *  *  *                                            *  *  * 
 *  *  *  *                                      *  *  *  * 
 *  *  *  *  *                                *  *  *  *  * 
 *  *  *  *  *  *                          *  *  *  *  *  * 
 *  *  *  *  *  *  *                    *  *  *  *  *  *  * 
 *  *  *  *  *  *  *  *              *  *  *  *  *  *  *  * 
 *  *  *  *  *  *  *  *  *        *  *  *  *  *  *  *  *  * 
 *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  * 





import java.util.Scanner;

public class Pattern_2_2 {
    public static void main(String[] args)
    {
        int num1;
        System.out.println("Enter the number of row : ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();

        for(int i = 1; i <= num1; i++)
        {
            for (int j=num1; j>=i; j--)
            {
                System.out.print(" * ");
            }
            for (int k=2; k<=i; k++)
            {
                System.out.print("   ");
            }
            for (int k=2; k<=i; k++)
            {
                System.out.print("   ");
            }
            for (int j=num1; j>=i; j--)
            {
                System.out.print(" * ");
            }


            System.out.println();
        }
        for(int q = 2; q <= num1; q++) {
            for (int k = 1; k <= q; k++)
            {
                System.out.print(" * ");
            }
            for(int w = num1-1; w >=q; w-- )
            {
                System.out.print("   ");
            }
            for(int w = num1-1; w >=q; w-- )
            {
                System.out.print("   ");
            }
            for (int k = 2; k <= q+1; k++)
            {
                System.out.print(" * ");
            }


            System.out.println();
        }

    }
}

